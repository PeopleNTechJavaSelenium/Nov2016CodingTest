package math;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import databases.ConnectDB;

import java.sql.ResultSet;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		String primenumbers1 = "";
		String primenumbers2 = "";
		int n = 10000;
		for (int i = 2; i < n; i++) {
			if (checkPrime1(i)) {
				//System.out.print(i + ",");
				primenumbers1 = primenumbers1+Integer.toString(i) + ",";
			}
		}
		//System.out.println("");
		for (int i = 0; i < n; i++) {
			if (checkPrime(i)) {
				//System.out.print(i + ",");
				primenumbers2 = primenumbers2 +Integer.toString(i)+ ",";
			}
		}


		ConnectDB connectDB = new ConnectDB();
		ConnectDB.connectMongoDB2();
		ResultSet rs = null;
		try {
			connectDB.directDatabaseQueryExecute("delete from tbl_PrimeNumber");
			String sql="INSERT INTO `core_java`.`tbl_primenumber` (`number`, `primenumbers`, `primenumbersrecursion`) ";
			sql = sql + " VALUES("+n+",'"+primenumbers1+"','"+primenumbers2+"')";

			connectDB.directDatabaseQueryExecute(sql);

			System.out.println("\n\nData is reading from the Table (tbl_PrimeNumber) and displaying to the console\n");
			rs =connectDB.Query("select * from tbl_primenumber");
			while(rs.next()) {
				System.out.println(rs.getString("number"));
				System.out.println("Method 1 without using Recursion");
				System.out.println(rs.getString("primenumbers"));
				System.out.println("\nMethod 2 using Recursion");
				System.out.println(rs.getString("primenumbersrecursion"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*Mongodb section start*/
		DBCursor cursor = null;
		try {
			ConnectDB.removeMongoDBDataDocument("tbl_PrimeNumber");
			BasicDBObject doc = new BasicDBObject();
			doc.put("number", n);
			doc.put("primenumbers", primenumbers1);
			doc.put("primenumbersrecursion", primenumbers2);
			ConnectDB.insertMongoDBDataDocument("tbl_PrimeNumber",doc);

			System.out.println("\n\nData is reading from the MongoDB Collection (tbl_PrimeNumber) and displaying to the console\n");
			cursor = ConnectDB.getMongoDBDataDocument("tbl_PrimeNumber");
			while(cursor.hasNext()) {
				DBObject obj = cursor.next();
				System.out.println((int)obj.get("number"));
				System.out.println("Method 1 without using Recursion");
				System.out.println((String)obj.get("primenumbers"));
				System.out.println("\nMethod 2 using Recursion");
				System.out.println((String)obj.get("primenumbersrecursion"));
			}
		}catch (MongoException e) {
			e.printStackTrace();
		}finally {
			if(cursor!=null){
				cursor=null;
			}
		}
		/*Mongodb section end*/
	}
	public static boolean checkPrime(int n){

		boolean[] isPrime = new boolean[n+1];
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}
		//using Sieve of Eratosthenes
		for (int factor = 2; factor*factor <= n; factor++) {
			// if factor is prime, then mark multiples of factor as nonprime
			// suffices to consider mutiples factor, factor+1, ...,  n/factor
			if (isPrime[factor]) {
				for (int j = factor; factor*j <= n; j++) {
					isPrime[factor*j] = false;
				}
			}
		}

		return isPrime[n];
	}


	static boolean checkPrime1(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}

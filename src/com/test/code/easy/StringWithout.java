package com.test.code.easy;

public class StringWithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strWithout3a3b(0, 3));

	}

	private static String strWithout3a3b(int A, int B) {

		StringBuilder sb = new StringBuilder(A+B);

		if (A >= 0 && A <= 100 && B >= 0 && B <= 100) {

			try {

				
		        while (A > 0 || B > 0) {
		            if (A == B) {
		                sb.append("ab");
		                A--;
		                B--;
		            } else if (A > B) {
		                if (A >= 2) {
		                    sb.append("aa");
		                    A = A - 2;
		                } else {
		                    sb.append("a");
		                    A--;
		                }
		                if (B > 0) {
		                    sb.append("b");
		                    B--;
		                }
		                continue;
		            } else {
		                if (B >= 2) {
		                    sb.append("bb");
		                    B = B - 2;
		                } else {
		                    sb.append("b");
		                    B--;
		                }
		                if (A > 0) {
		                    sb.append("a");
		                    A--;
		                }
		            }
		            
		        }
		        
		       
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

		return sb.toString();
	}

}

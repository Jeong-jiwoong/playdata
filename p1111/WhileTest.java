package p1111;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s= 0;   //���������� �ʱ�ȭ�ؼ� ����ؾߵȴ�.
		int i=1;
		while(i<101) {
			s += i++;
		}
		System.out.println("s:" + s );
	

		//1. 1~100 ������ �Ҽ� 
		int j, cnt=0;
		i=2;
		while(i<101) {
			cnt = 0;
			j=2;
			while(j<i) {
				if(i%j==0) {
					cnt++;
				}
				j++;
			}
			if(cnt==0) {
				System.out.print(i  + ", ");
		}
			i++;
		}
		
		
		//2. �簢��(����, ���� ũ�� ����)
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n�簢�� ũ��:");
		size = sc.nextInt();
		j=0;
		while (j < size) {
			i = 0;
			while( i < size) {
			System.out.print("*");
			i++;
		}
		System.out.println();
		j++;
}
}
	
	
	//3. �ﰢ��
	
	
}

package �迭.�ٱ��ϵ�����;

import java.io.*;
import java.util.*;

public class �ٱ��ϵ�����_10811 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		int[] ba = new int[N];
		for(int i=0; i<N; i++) {
			ba[i] = i+1;	//�ٱ��Ϻ��� ���ְ�
		}
		
		//����Է¹ޱ�
		for(int j=0; j<M; j++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken())-1;	//�Է¹����Ÿ� �迭�ε����� �ٷ� ���Ŵϱ� -1�� ������
			int end = Integer.parseInt(st.nextToken())-1;
			//start���� end���� �ٱ��� �����´�..
			// ex) [1,2,3,4,5]�̰� start�� 1, end�� 5�϶� ��. �������� 2�� 4... 3�� 3
			// start�� end���� ������������ �ݺ�
			while(start<end) {      //1 < 5 �϶�
				int temp = ba[start]; 
				ba[start] = ba[end];
				ba[end] = temp;  //�ѹ��� �������� 1 5 ��ȯ��
				start++;	//start�� 2��
				end--;		//end�� 4��
			}
		}
		//�����ⳡ
		StringBuilder sb = new StringBuilder();
		for(int k=0; k<ba.length; k++) {
			sb.append(ba[k]).append(' ');
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}

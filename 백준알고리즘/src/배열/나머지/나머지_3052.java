package �迭.������;

import java.io.*;

public class ������_3052 {
//10���� �� �Է�. �� �� ������ 42�� �������� �� ���� �ٸ� �������� ��ΰ�?
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//� ���� n���� �������� �� �������� ���� �� �ִ� ���� 0~n-1����
		//nums �迭�� 0���� 41������ �� ���ڰ� �Է¹��� ���ڵ��� 42�� ���� ������ �� �ϳ������� ��Ÿ��
		boolean[] nums = new boolean[42];
		//
		for(int i=0; i<10; i++) {
			//������ ���� �迭�� �ε����� ����Ͽ� �ش� ��ġ�� ���� true��.
			nums[Integer.parseInt(br.readLine())%42] = true;
		}
		int count=0;
		for(boolean value : nums) {
			if(value) {	//value�� true�̸�
				count++;
			}
		}
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}

}

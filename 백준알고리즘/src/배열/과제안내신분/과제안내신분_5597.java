package �迭.�����ȳ��ź�;

import java.io.*;
import java.util.*;

public class �����ȳ��ź�_5597 {
	//�� ����� 1, �ȳ� ����� 0���� �Ǻ��Ұ���.
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//�л� 30�� �⼮��ȣ�� 1������ 30������
		int[] stu_nums = new int[31];	//�迭���� 0���� �ʱ�ȭ
		
		//���� ������ �л��� �⼮��ȣ �Է�.
		for(int i=1; i<=28; i++) {
			//�⼮��ȣ�� �ش��ϴ� �迭 ������ ���� 1�� ����
			stu_nums[Integer.parseInt(br.readLine())]++;
		}
		//���� ���� ���
		for(int j=1; j<stu_nums.length; j++) {//1������ 30������ ã�ƺ�
			if(stu_nums[j]==0) { //0�̸� �ȳ��Ŵϱ�
				bw.write(Integer.toString(j) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

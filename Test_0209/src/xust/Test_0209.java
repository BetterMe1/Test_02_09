package xust;

/*
1. ���ֵĲ���
����һ����������������Ĳ����������ǶԸ����Ķ����Ʊ�ʾȡ����
ע��:
������������֤��32λ�����������ķ�Χ�ڡ�
����Լٶ���������������ǰ����λ��

ʾ�� 1:
����: 5
���: 2
����: 5�Ķ����Ʊ�ʾΪ101��û��ǰ����λ�����䲹��Ϊ010����������Ҫ���2��

ʾ�� 2:
����: 1
���: 0
����: 1�Ķ����Ʊ�ʾΪ1��û��ǰ����λ�����䲹��Ϊ0����������Ҫ���0��
 */
public class Test_0209 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int num = 5;
		System.out.println(So.findComplement(num));
	}
}
class Solution {
    public int findComplement(int num) {
    	int temp = num;
    	int temp2 = 1;
    	while(temp!=0){
    		temp/=2;
    		temp2*=2;
    	}
        return num ^ (temp2-1);
    }
}
package JUnit;
import JUnit.MyArithmeticException;
public class Equation {
	private static  float x1;
	private  static float x2;
	private static float x;
	private static float real;
	private static float imag;
	private static float[] results;
	private static float a;
	private static float b;
	private  static float c;
	
	private static float delt;
	 public static float[] calc(float w,float p,float q)throws Exception{
		  results=new float[2];
		  a=w;  b=p;  c=q;
		  if(0.0f==a){   //bx+c=0;  x=-c/b;
				 if(0.0f!=b){
					x=-c/b; 
					results[0]=x;
					print();
				    return results;
				 }
				 else{
					 throw new MyArithmeticException("��������Ϊ0");
				 }
		  }else{
			  delt=b*b-4*a*c;
			  if(delt>=0){
				x1=(float) ((-b+Math.sqrt(delt))/(2*a));
				x2=(float) ((-b-Math.sqrt(delt))/(2*a));
				results[0]=x1;
				results[1]=x2;
				print();
				return results;
			
			  }else{
				  real=-b/(2*a);
				  imag=(float) (Math.sqrt(-delt)/(2*a));
				  results[0]=real;
				  results[1]=imag;
				  print();
					return results;
			  }
		 }
	 }
	public static void print(){
		 if(0.0f==a){ 
			 if(0.0f!=b){
				 System.out.println("�÷�����һԪһ�η��̣����Ϊ��x="+results[0]);
			 }else{
				 System.err.println("����һ�����̣�");
			 }
		 }else{
			  if(delt>=0){
				  System.out.println("�÷�����һԪ���η��̣������ֱ�Ϊ��x1="+results[0]+",x2="+results[1]);  
			  }else{
				  System.out.println("��һԪ���η��̵ĸ�Ϊ����,�����ֱ�Ϊ:x1="+results[0]+"+"+results[1]+"i"+",x2="+results[0]+"-"+results[1]+"i");
			  }
		 }
	 }
}

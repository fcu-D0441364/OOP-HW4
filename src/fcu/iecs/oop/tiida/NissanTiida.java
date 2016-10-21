package fcu.iecs.oop.tiida;

public class NissanTiida {
	public void tiida(int num){
		int i, j, k;
		for(i=1;i<=num;i++){
			for(j=0;j<i;j++){
				for(k=0;k<i;k++)
				System.out.print('*');
			System.out.println("");
			}
		}
	}
}

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int opc=0;
		Methods met=new Methods();
		Menu m = new Menu();

		int[] vec= new int[6];
		int[] vec2= {2,9};
		int[] vec3= {1,2,5,8};
		int[] vec4=new int[6];
		
		
		relleno(vec);
		do {
			
			m.menuP();
			opc=Integer.parseInt(sc.nextLine());
			switch(opc){
			
			case 1:
				met.Bubble_sort(vec);
				break;
			case 2:
				met.QuicksortM(vec);
				break;
			case 3:
				met.insetion(vec);
				break;
			case 4:
				met.merge(vec);
			
				break;
			case 5:
				met.selectiopnSort(vec);
				
				break;
			case 6:
				met.printV(vec);
				relleno(vec);
				break;
			default:
				
				m.Faliure();
				relleno(vec);
				
				break;
			}
			
		}while(opc!=7);		
	}
	private static void relleno(int[] a) {
		Random rand = new Random();
		for(int i=0;i<a.length;i++) {
			a[i]=rand.nextInt(100);
			
		}
	}
}

	


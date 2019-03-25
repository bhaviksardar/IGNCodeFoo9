import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class withcer_problem {
	
	public static int findvalue(ArrayList<Double> x){
		int temp=0;
		int l=0;
		int b=0;
		for(int y=0;y<=x.size();y++){
			if(x.get(b)>x.get(l+1)){
				temp = b;
				l++;
				//return temp;
			}
			else{
				temp=l+1;
				b++;
				//return temp;
			}
		}
		return temp;
	}
	
	public static String highestvalue(double[] x){
		int index;
		int w=1;
		int v=0;
		//System.out.println(x.length);
		for(int z=0;z<=x.length-1;z++){
			//System.out.println("test");
			System.out.println(x[v]);
			System.out.println(x[w]);
			System.out.println(x.toString());
			if(x[v]<x[w]){
				x[v]=x[w];
				w++;
				v++;
			}
			else{
				w++;
			}
		}
		return x.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner (System.in);
		
		System.out.println("Finds the most value for yuor buck armor set");
		double[] helmetcost={90,77,68,60,54,49,46,44};
		double[] helmetarmor={23,24,16,16,15,13,12,12};
		String[] helmetname={"Serpentine","Keeton","Feline","Ornate Helmet","Offner","Leather","Silgar's Noggin","Glass Bowl"};
		ArrayList<Double> helmetvalue = new ArrayList<Double>();
		for(int i=0; i<=helmetcost.length-1;i++){
		helmetvalue.add(i, (helmetcost[i]/helmetarmor[i]));
		//System.out.println(helmetvalue.get(i));
		}
		
		
		
		double[] leggingcost={87,78,75,69,62,59,56,53,47,45,42};
		double[] leggingarmor={22,18,15,17,11,15,12,14,11,10,13};
		String[] leggingname = {"Famed Pon","Ursine","Wolven","Hansen","Griffen Pants","Tanned Leg","Manticore","Mail Emares","Woven","Silken","Tattered"};
		ArrayList<Double> leggingvalue = new ArrayList<Double>();
		for(int i=0; i<=leggingcost.length-1;i++){
		leggingvalue.add(i, (leggingcost[i]/leggingarmor[i]));
		}
		
		/*int templ;
		int ll=0;
		int bl=0;
		for(int y=0;y<=leggingvalue.size();y++){
			if(leggingvalue.get(bl)>leggingvalue.get(ll+1)){
				templ = bl;
				ll++;
			}
			else{
				templ=ll+1;
				bl++;
			}
		}*/
		
		double[] chestcost={67,64,62,59,58,57,55,54,50};
		double[] chestarmor={22,23,21,20,10,19,19,18,17};
		String[] chestname={"ADJ","Vachon","Kaer Morhen","Cured Leather","Smith's Plated","Dented Plate","Jeweled Drake","Ginger's Gilded","Garcia Guard"};
		ArrayList<Double> chestvalue = new ArrayList<Double>();
		for(int i=0; i<=chestcost.length-1;i++){
		chestvalue.add(i, (chestcost[i]/chestarmor[i]));
		}
		
		/*int tempc;
		int lc=0;
		int bc=0;
		for(int y=0;y<=chestvalue.size();y++){
			if(chestvalue.get(bc)>chestvalue.get(lc+1)){
				tempc = bc;
				lc++;
			}
			else{
				tempc=lc+1;
				bc++;
			}
		}*/
		
		double[] bootcost={64,52,52,35,33};
		double[] bootarmor={18,14,20,7,5};
		String[] bootname={"Diamond","Steel","Tate's Spiked","Leather Lunde","Cloth"};
		ArrayList<Double> bootvalue = new ArrayList<Double>();
		for(int i=0; i<=bootcost.length-1;i++){
		bootvalue.add(i, (bootcost[i]/bootarmor[i]));
		}
		
		/*int tempb;
		int lb=0;
		int bb=0;
		for(int y=0;y<=bootvalue.size();y++){
			if(bootvalue.get(bb)>bootvalue.get(lb+1)){
				tempb = bb;
				lb++;
			}
			else{
				tempb=lb+1;
				bb++;
			}
		}*/
		
		System.out.println("Armor Cost: "+(bootcost[findvalue(bootvalue)]+helmetcost[findvalue(helmetvalue)]+chestcost[findvalue(chestvalue)]+leggingcost[findvalue(leggingvalue)]));
		//System.out.println("Armor Value: "+(bootarmor[findvalue(bootvalue)]+helmetarmor[findvalue(helmetvalue)]+chestarmor[findvalue(chestvalue)]+leggingarmor[findvalue(leggingvalue)]));
		System.out.println("Armor Set: "+(bootname[findvalue(bootvalue)]+" "+helmetname[findvalue(helmetvalue)]+" "+chestname[findvalue(chestvalue)]+" "+leggingname[findvalue(leggingvalue)]));
		/*Arrays.sort(helmetarmor);
		Arrays.sort(bootarmor);
		Arrays.sort(chestarmor);
		Arrays.sort(leggingarmor);
		Arrays.sort(helmetcost);
		Arrays.sort(bootcost);
		Arrays.sort(chestcost);
		Arrays.sort(leggingcost);*/
		
		//Arrays.sort(helmetvalue, Collections.reverseOrder());
		
		for(int f=helmetarmor.length-1;f<=helmetarmor.length-1;f--){
			
		}
	}
	

}

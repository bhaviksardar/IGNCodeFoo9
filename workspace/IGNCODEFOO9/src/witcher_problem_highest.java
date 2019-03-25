import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class witcher_problem_highest {
	
	public static int findvalue(ArrayList<Integer> x){
		int temp=0;
		int l=0;
		int b=0;
		for(int y=0;y<=x.size();y++){
			if(x.get(b)>x.get(l+1)){
				temp = b;
				l++;
				b++;
				//return temp;
			}
			else{
				temp=l+1;
				b++;
				l++;
				//return temp;
			}
		}
		return temp;
	}
	
	
	public static double highestIndex(ArrayList<Integer> x){
		int max = x.get(0);

		for (int i = 1; i < x.size(); i++) {
		    if (x.get(i) > max) {
		      max = x.get(i);
		    }
		}
		return max;
	}
	
	public static int highestIndexArray(int[] x){
		int max = x[0];

		for (int i = 1; i < x.length; i++) {
		    if (x[i] > max) {
		      max = x[i];
		    }
		}
		return max;
	}
	
	public static int find(ArrayList<Integer> array, double value) {
		int i = 0;
		int temp=0;
		//System.out.println("test");
	    for( i=0; i<array.size(); i++)
	         if(array.get(i) == value){
	        	//System.out.println("test");
	        	//System.out.println(i);
	    		temp=i;
	         }
	    return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner (System.in);
		
		
		int[] helmetcost1={90,77,68,60,54,49,46,44};
		int[] helmetarmor1={23,24,16,16,15,13,12,12};
		String[] helmetname={"Serpentine","Keeton","Feline","Ornate Helmet","Offner","Leather","Silgar's Noggin","Glass Bowl"};
		ArrayList<Integer> helmetarmor = new ArrayList<Integer>();
		for(int i=0; i<=helmetarmor1.length-1;i++){
			helmetarmor.add(helmetarmor1[i]);
			}
		
		
		int[] leggingcost1={87,78,75,69,62,59,56,53,47,45,42};
		int[] leggingarmor1={22,18,15,17,11,15,12,14,11,10,13};
		String[] leggingname = {"Famed Pon","Ursine","Wolven","Hansen","Griffen Pants","Tanned Leg","Manticore","Mail Emares","Woven","Silken","Tattered"};
		ArrayList<Integer> leggingarmor = new ArrayList<Integer>();
		for(int i=0; i<=leggingarmor1.length-1;i++){
			leggingarmor.add(leggingarmor1[i]);
			//System.out.println(helmetvalue.get(i));
			}
		
		int[] chestcost1={67,64,62,59,58,57,55,54,50};
		int[] chestarmor1={22,23,21,20,10,19,19,18,17};
		String[] chestname={"ADJ","Vachon","Kaer Morhen","Cured Leather","Smith's Plated","Dented Plate","Jeweled Drake","Ginger's Gilded","Garcia Guard"};
		ArrayList<Integer> chestarmor = new ArrayList<Integer>();
		for(int i=0; i<=chestarmor1.length-1;i++){
			chestarmor.add(chestarmor1[i]);
			//System.out.println(helmetvalue.get(i));
			}
		
		int[] bootcost1={64,52,52,35,33};
		int[] bootarmor1={18,14,20,7,5};
		String[] bootname={"Diamond","Steel","Tate's Spiked","Leather Lunde","Cloth"};
		ArrayList<Integer> bootarmor = new ArrayList<Integer>();
		for(int i=0; i<=bootarmor1.length-1;i++){
			//System.out.println(bootarmor[i]);
			bootarmor.add(bootarmor1[i]);
			//System.out.println(helmetvalue.get(i));
			}
		
		//System.out.println(highestIndex(chestarmor));
		//System.out.println(highestIndex(helmetarmor));
		//System.out.println(highestIndex(bootarmor));
		//System.out.println(highestIndex(leggingarmor));
		//System.out.println(find(bootarmor,highestIndex(bootarmor)));
		
		//System.out.println(findvalue(helmetarmor));
		//System.out.println(highestIndexArray(helmetarmor1)+highestIndexArray(bootarmor1)+highestIndexArray(leggingarmor1)+highestIndexArray(chestarmor1));
		//System.out.println(helmetcost1[find(helmetarmor1,highestIndexArray(helmetarmor1))]+chestcost1[find(chestarmor1,highestIndexArray(chestarmor1))]+leggingcost1[find(leggingarmor1,highestIndexArray(leggingarmor1))]+bootcost1[find(bootarmor1,highestIndexArray(bootarmor1))]);;
		if((bootcost1[find(bootarmor,highestIndex(bootarmor))]+helmetcost1[find(helmetarmor,highestIndex(helmetarmor))]+chestcost1[find(chestarmor,highestIndex(chestarmor))]+leggingcost1[find(leggingarmor,highestIndex(leggingarmor))]>300)){
			if(bootcost1[find(bootarmor,highestIndex(bootarmor))] > helmetcost1[find(helmetarmor,highestIndex(helmetarmor))]){
				if(bootcost1[find(bootarmor,highestIndex(bootarmor))] > chestcost1[find(chestarmor,highestIndex(chestarmor))]){
					if(bootcost1[find(bootarmor,highestIndex(bootarmor))] > leggingcost1[find(leggingarmor,highestIndex(leggingarmor))]){
						bootarmor.remove(find(bootarmor,highestIndex(bootarmor)));
					}
				}
			}
			else if(helmetcost1[find(helmetarmor,highestIndex(helmetarmor))] > bootcost1[find(bootarmor,highestIndex(bootarmor))]){
				if(helmetcost1[find(helmetarmor,highestIndex(helmetarmor))] > chestcost1[find(chestarmor,highestIndex(chestarmor))]){
					if(helmetcost1[find(helmetarmor,highestIndex(helmetarmor))] > leggingcost1[find(leggingarmor,highestIndex(leggingarmor))]){
						helmetarmor.remove(find(helmetarmor,highestIndex(helmetarmor)));
					}
				}
			}
			else if(chestcost1[find(chestarmor,highestIndex(chestarmor))] > bootcost1[find(bootarmor,highestIndex(bootarmor))]){
				if(chestcost1[find(chestarmor,highestIndex(chestarmor))] > helmetcost1[find(helmetarmor,highestIndex(helmetarmor))]){
					if(chestcost1[find(chestarmor,highestIndex(chestarmor))] > leggingcost1[find(leggingarmor,highestIndex(leggingarmor))]){
						chestarmor.remove(find(chestarmor,highestIndex(chestarmor)));
					}
				}
			}
			else if(leggingcost1[find(leggingarmor,highestIndex(leggingarmor))] > bootcost1[find(bootarmor,highestIndex(bootarmor))]){
				if(leggingcost1[find(leggingarmor,highestIndex(leggingarmor))] > helmetcost1[find(helmetarmor,highestIndex(helmetarmor))]){
					if(leggingcost1[find(leggingarmor,highestIndex(leggingarmor))] > chestcost1[find(chestarmor,highestIndex(chestarmor))]){
						leggingarmor.remove(find(leggingarmor,highestIndex(leggingarmor)));
					}
				}
			}
		}
		else{
			int change = 300-(bootcost1[find(bootarmor,highestIndex(bootarmor))]+helmetcost1[find(helmetarmor,highestIndex(helmetarmor))]+chestcost1[find(chestarmor,highestIndex(chestarmor))]+leggingcost1[find(leggingarmor,highestIndex(leggingarmor))]);
			int spare=0;
			int l=0;
			while(l<chestcost1.length){
				if(change == chestcost1[l]){
					spare = chestcost1[l];
				}
				else{
					spare = 0;
				}
				l++;
				
			}
			System.out.println("Armor Value: "+(highestIndex(chestarmor)+highestIndex(helmetarmor)+highestIndex(bootarmor)+highestIndex(leggingarmor)+ chestcost1[l]));
			System.out.println("Crown Value: "+(bootcost1[find(bootarmor,highestIndex(bootarmor))]+helmetcost1[find(helmetarmor,highestIndex(helmetarmor))]+chestcost1[find(chestarmor,highestIndex(chestarmor))]+leggingcost1[find(leggingarmor,highestIndex(leggingarmor))]+spare));
			System.out.println("Armor Set: " +(bootname[find(bootarmor,highestIndex(bootarmor))]+","+helmetname[find(helmetarmor,highestIndex(helmetarmor))]+","+chestname[find(chestarmor,highestIndex(chestarmor))]+","+leggingname[find(leggingarmor,highestIndex(leggingarmor))]+","+chestname[l]));
		}
	}
}

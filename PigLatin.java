/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

import java.util.Scanner;

/**
 *
 * @author alucard
 */
public class PigLatin {

  
	
	public static void getWord( String word) 
	{
		
		if(word !=null)
		{
		
		if (word.startsWith("a") || word.startsWith("e")||word.startsWith("u")|| word.startsWith("o")||word.startsWith("y")||word.startsWith("i"))
		{
			word.concat("way");
                        System.out.println(word);
                        return;
		}
		if (word.startsWith("s") || word.startsWith("c"))
		{
			char[] in = word.toCharArray();
			char[] t = word.toCharArray();
			int beg=2;
			int end=in.length -1 ;
			char temp;
			while(beg<end)
			{
				temp=in[beg];						
				in[beg]=in[end];
				in [end]=temp;		
			}
			in[end+1]=t[0];
			in[end+2]=t[1];
			word.concat("ay");
                        System.out.println(word);
                        return;
		}
		else
		{
			char[] in = word.toCharArray();
			char[] t = word.toCharArray();
			
				int beg=1;
			int end=in.length -1 ;
			char temp;
			while(beg<end)
			{
				temp=in[beg];						
				in[beg]=in[end];
				in [end]=temp;		
			}
			in[end+1]=t[0];
			word.concat("ay");
                        System.out.println(word);
                        return ;
		}
		}
		else
		{
			System.out.println("we dont accept null");
		}
	
		
		
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	String name ;
	boolean game=true;
	String stop;

while(game){
	
System.out.println("welcome to pig latin game insert a word ");
Scanner sc = new Scanner(System.in);
name=sc.nextLine();
if(name!=null)
{
getWord(name);
System.out.println("if you want to stop press s");
		stop= sc.nextLine();
		if(stop.equals("s"))
		{
			game=false;
		}
		
}		 
	}

}
}
    


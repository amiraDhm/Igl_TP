/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpigl;

import java.util.Arrays;
import java.util.Scanner;


public class VectorHelper {
   
 private int[] vector ;  
 private int taille;
 public VectorHelper(int taille ,int[] vector) 
 { 

   // int ent;
    this.vector =new int[taille];
    this.taille=taille;
    this.vector=vector;
    /*Scanner sc = new Scanner(System.in);
    for (int i=0;i<taille;i++)
    {
      System.out.println("Donnez le "+i+" eme entier ");
                   ent = sc.nextInt();   
                   this.vector[i]=ent;*/
    
    }

   
    public int getTaille() 
    {
        return taille;
    }

    public void setTaille(int taille) 
    {
        this.taille = taille;
    }
    
    public void setVector(int[] vector) 
    {
        this.vector=vector;
        
    }

    public int[] getVector() 
    {
        return vector;
    }

    
    
    
    public void triVec() 
    {
        //Arrays.sort(this.vector);
        int i, j, cle;
		
		for (i = 1; i < this.vector.length; i++) {
			cle = this.vector[i];
			j = i;
			while ((j >= 1) && (this.vector[j - 1] > cle)) {
				this.vector[j]  = this.vector[j - 1] ;
				j = j - 1;
			}
			this.vector[j] = cle;
		}
                
	}
    public int[] somVec(VectorHelper v) throws ExceptionVec 
//ou bien l'entree c un tableau n'est pas objet
    {
        int[] vecSom=new int[this.taille]; 
        if (this.vector.length!=v.getVector().length) throw new ExceptionVec();
        {
            System.out.println("les deux vecteurs ne sont pas de la meme taille ");
        }
        if (this.vector.length==v.getVector().length)
        {
       
            for (int i=0;i<this.taille;i++)
            {
                vecSom[i]=this.vector[i]+v.getVector()[i];
            }
        }
     return vecSom;
    }
    public void inversVec() /**permettre d'inverser le tableau*/ 
    {
       
    int i , tmp;
    for(i=0 ; i < this.taille/2 ; i++) {
        tmp = this.vector[i];
        this.vector[i] = this.vector[this.taille-i-1];
        this.vector[this.taille-i-1] = tmp;
    }
    
}
    public void affichVec() 
    { 
        for (int i=0;i<this.taille;i++)
        {
            System.out.println(" "+this.vector[i]);
        }
    }
    public void affich (int[] v) 
    {
        for (int i=0;i<v.length;i++)
        {
            System.out.println(" "+v[i]);
        }
    }
    
    public int [] minmax ()
 {
	int i=1;
	int min=this.vector[0];
	int max=this.vector[0];
	while (i < this.taille)
	  {
		if ( this.vector[i]<= min ) { min = this.vector[i]; }
		else { if ( this.vector[i]>max ) { max = this.vector[i]; }	 }
		i=i+1;
	  }
        int[] v={min,max};
        return v;
        
	
}
    
 public void multiplvector (int nb )
 {
     int i;
   
    
     for ( i=0; i< this.taille; i++)
         {
            this.vector[i] = nb*this.vector[i] ;
         }
     
  
 }	
    
    }

        
	
    
 


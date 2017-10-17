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
 public VectorHelper(int taille) 
 { 

    int ent;
    this.vector =new int[taille];
    this.taille=taille;
    Scanner sc = new Scanner(System.in);
    for (int i=0;i<taille;i++)
    {
      System.out.println("Donnez le "+i+" eme entier ");
                   ent = sc.nextInt();   
                   this.vector[i]=ent;
    }
    }
    public int getTaille() 
    {
        return taille;
    }

    public void setTaille(int taille) 
    {
        this.taille = taille;
    }

    public Object getSc() {
        return sc;
    }

    public void setSc(Object sc) {
        this.sc = sc;
    }
    private Object sc;

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
    
    public void minmax (VectorHelper v)
 {
	int i=1;
	int min=v.vector[0];
	int max=v.vector[0];
	while (i < v.taille)
	  {
		if ( v.vector[i]<= min ) { min = v.vector[i]; }
		else { if ( v.vector[i]>max ) { max = v.vector[i]; }	 }
		i=i+1;
	  }
        System.out.println("le Min est:"+min);
        System.out.println("le Max est:"+max);
	
}
    
 public void multiplvector ( VectorHelper v )
 {
     int i;
     int nb;
     Scanner sc = new Scanner(System.in);
     System.out.println("donnez le facteur de multiplication");
     nb = sc.nextInt(); 
     for ( i=0; i< this.taille; i++)
         {
            v.vector[i] = nb*v.vector[i] ;
         }
     
 }	
    
    }

        
	
    
 


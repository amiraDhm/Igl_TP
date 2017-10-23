/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpigl;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dahmani Amira
 *         Boudaoud Ikram
 */
public class VectorHelper {
   
 private int[] vector ;  
 private int taille;
 
    /**
     *
     * @param taille la taille du vector ex: taille=5;
     * @param vector le tableau dont les éléménts seront attribués à vector de VectorHelper ex:vector={2,3,1,6,4}
     */
    public VectorHelper(int taille ,int[] vector) 
    { 

   
    this.vector =new int[taille];
    this.taille=taille;
    this.vector=vector;
  
    
    }

    /**
     *
     * @return donne la valeur de Taille 
     */
    public int getTaille() 
    {
        return taille;
    }

    /**
     *
     * @param taille la valeur à attribuer à Taille
     */
    public void setTaille(int taille) 
    {
        this.taille = taille;
    }
    
    /**
     *
     * @param vector le tableau dont les éléments seront attribués à vector du VectorHelper
     */
    public void setVector(int[] vector) 
    {
        this.vector=vector;
        
    }

    /**
     *
     * @return un tableau cotenant les éléments du tableau vector
     */
    public int[] getVector() 
    {
        return vector;
    }

    /**
     *  trier les éléments du tableau vector ex : vector ={3,1,8,2,4} apres le tri on aura vector={1,2,3,4,8}
     */
    public void triVec() 
    {
        
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

    /**
     *
     * @param v le tableau à sommer avec vector du VectorHelper
     * @return un tableau contenant la somme du v et vector
     * ex:vector ={3,1,8,2,4} et le parametre v={4,8,2,9,1} apres la somme on aura vector={7,9,10,11,5}
     * @throws ExceptionVec si les tailles du v et vector sont différentes
     *ex : vector={3,1,8,2,4} et v={4,8,2,9,1,3} une exception sera levée car sont de tailles deffirentes 
     */
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

    /**
     * inverser les éléments du vector ex : vector ={3,1,8,2,4} apres inversVec on aura vector ={4,2,8,1,3}
     */
    public void inversVec() 
    {
       
    int i , tmp;
    for(i=0 ; i < this.taille/2 ; i++) {
        tmp = this.vector[i];
        this.vector[i] = this.vector[this.taille-i-1];
        this.vector[this.taille-i-1] = tmp;
    }
    
}

    /**
     * afficher les éléments du vector
     */
    public void affichVec() 
    { 
        for (int i=0;i<this.taille;i++)
        {
            System.out.println(" "+this.vector[i]);
        }
    }

    /**
     *
     * @param v un tableau quelconque
     */
    public void affichStand (int[] v) 
    {
        for (int i=0;i<v.length;i++)
        {
            System.out.println(" le"+i+" element"+v[i]);
        }
    }
    
    /**
     *
     * @return un tableau contenant le Min et le Max du vector ex: vector ={3,1,8,2,4} apres minmax on aura tableau du min et max dans le vecteur v={1,8}
     */
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
    
    /**
     *
     * @param nb le facteur de multiplication des éléments du vector ex: vector ={3,1,8,2,4} avec nb=3 on aura vector={9,3,24,6,12}
     */
    public void multiplvector (int nb )
 {
     int i;
   
    
     for ( i=0; i< this.taille; i++)
         {
            this.vector[i] = nb*this.vector[i] ;
         }
     
  
 }	
    
    }

        
	
    
 


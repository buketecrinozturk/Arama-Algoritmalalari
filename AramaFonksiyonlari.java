
package BEO;

/**
 *
 * @author buketecrinozturk
 */

    public class AramaFonksiyonlari {
    //     int dizi[]={25,-1,3,2,32,1,7,17,0};
    //-------------------LinearSearch----------------------
    public int linearSearch(int dizi[], int n ,int aranan){
       int i=0,  yedek=0;
       for(i=0; i<n; i++)
       {
           if(dizi[i]==aranan){
               return i;
           }
       }
       return -1;
    }
    //-------------------binearySearch normal fonksiyon----------------------
    public int binearySearch(int dizi [], int n, int aranan){
        int sol=0; 
        int sag=n-1; 
        while(sol<=sag){
            int m = (int) sol+(sag-sol)/2;
            
             if(dizi[m]==aranan)
                    return m;
             if(dizi[m]<aranan)
                    sol=m+1;
             if(dizi[m]>aranan)
                    sag=m-1;
        }    
        return -1;
            
    }
    //-------------------binearySearch recursive fonksiyon----------------------
    public int r_binarySearch(int dizi [], int sol, int sag, int aranan){
        if(sag>1){
            int m = (int) sol+(sag-sol)/2;
            if(dizi[m]==aranan)
                    return m;
            if(dizi[m]<aranan)
                   return r_binarySearch(dizi,m+1,sag,aranan);
            return r_binarySearch(dizi,sol,m-1,aranan);   
        }    
        return -1;
    }
}


package com.company;

public class hgs {

    private String plaka;
    private int tip,bakiye,odenentoppara,u1,u2,u3;
    public static int kartno=0;

    public hgs(String plaka,int tip){
        this.plaka=plaka;
        this.tip=tip;
        this.bakiye=150;
        this.u1=2;
        this.u2=4;
        this.u3=7;
        kartno=kartno+1;
    }

    public int bakiye_yukle(int p){
        this.bakiye=this.bakiye+p;
        return this.bakiye;
    }

    public int tahsil(int y){
        if (this.tip==1){
            this.bakiye=this.bakiye-(this.u1*y);
        }
        else if (this.tip==2){
            this.bakiye=this.bakiye-(this.u2*y);
        }
        else if (this.tip==3){
            this.bakiye=this.bakiye-(this.u3*y);
        }
        else {
            return 0;
        }
        return this.bakiye;
    }

    public void bilgi(){
        System.out.println("\nplaka: "+this.plaka+"\nbakiye: "+this.bakiye);
    }

    public int  ucret_guncelle(int snf,int ucr){
        if (this.tip==1){
            this.u1=ucr;
            return this.u1;
        }
        else if (this.tip==2){
            this.u2=ucr;
            return this.u2;
        }
        else if (this.tip==3){
            this.u3=ucr;
            return this.u3;
        }
        else {
            return 0;
        }
    }

}

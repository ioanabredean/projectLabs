package org.fasttrackit.catel;

public class Catel {
    private String  name;
    private int greutate;
    private int varsta;

    public void setName (String wantedname){
        name=wantedname;
    };

    public int getVarsta(){
        return varsta;
    }
    public void latra (){
        System.out.println("Ham");
    }

    public void mananca (){
        greutate++;;
        if (greutate >=10){
        varsta ++;
        }
    }

    public String getName() {
        return name;
    }
}

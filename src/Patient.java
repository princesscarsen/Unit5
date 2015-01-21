class Patient {
private String name;
private String condition;

public Patient(String nm,String cond){
    name=nm;
    condition=cond;
}
public String getName(){
    //retrieves name
    return name;
}
public String getCondition(){
    //retrieves condition
    return condition;
}
public boolean validate(){
    if(name==null||name=="")
        return false;
    else
        return true;
}
public boolean setName(String nm){
    //sets the name
    if(nm.equals(""))
        return false;
    else{
        name=nm;
        return true;
    }
}
public String toString(){
    return condition+"condition " + name+"";
//used to print out all information
}
  

}

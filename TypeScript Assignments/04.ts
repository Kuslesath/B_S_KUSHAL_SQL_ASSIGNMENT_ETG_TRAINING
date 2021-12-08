class Stud{
    sid:number;
    sName:string;
    sClass:string;
    
    constructor(i:number, n:string, s:string){
        this.sid=i;
        this.sName=n;
        this.sClass=s;
    }
    display(){
        console.log(this.sid);
        console.log(this.sName);
        console.log(this.sClass);
    }
}
   
var e1 = new Stud(100,"kushal","first");
e1.display();
var e2 = new Stud(101,"mark","second");
e2.display();
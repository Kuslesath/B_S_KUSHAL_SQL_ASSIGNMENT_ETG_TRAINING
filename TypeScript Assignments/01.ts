class Largest{
    n1:number=12;
    n2:number=25;
    n3:number=89;

    largestnum(){
    if (this.n1>this.n2 && this.n1>this.n3) {
        console.log(this.n1+" is largest.");
    }
    else if(this.n2>this.n1 && this.n2>this.n3){
        console.log(this.n2+" is largest.");
    }
    else {
        console.log(this.n3+" is largest.");
    }
}
}
var o = new Largest();
var o1 = o.largestnum();
console.log(o1);
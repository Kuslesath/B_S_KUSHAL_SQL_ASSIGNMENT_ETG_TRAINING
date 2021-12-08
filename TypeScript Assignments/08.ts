import { Car } from "./07";
class Truck extends Car{

    weight:number;
    constructor(i:number, n:string ,s:number,i1:number  ){
        super(i,n,s);
        this.weight=i1;
    }
    getSalesPrice():number{
        let w=this.weight;
        if (w>2000){
            return this.rPrice+(0.10*this.rPrice);
        }
        else
        return this.rPrice+(0.20*this.rPrice);
     }
}
var t= new Truck(100,"red",1000,2500);
var t11=t.getSalesPrice();
console.log("Sale price is "+t11);

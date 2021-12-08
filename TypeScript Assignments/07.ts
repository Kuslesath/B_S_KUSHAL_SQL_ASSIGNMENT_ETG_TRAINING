export class Car{
    speed:number;
    color:string;
    rPrice:number;

    constructor(i:number, n:string, b:number){
        this.speed=i;
        this.color=n;
        this.rPrice=b;
    }

    getSalesPrice():number{
       return this.rPrice+(0.18*this.rPrice);
    }
}
var f= new Car(10,"red",10000);
var f11=f.getSalesPrice();
console.log("Sale price is "+f11);
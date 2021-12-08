class Tshirt{

    color: string;
    material:string;
    design:string;
    size: string;
    
    constructor(i:string, n:string, b:string, s:string){
            
        this.color=i;
        this.material=n;
        this.design=b;
        this.size=s;

    }
    
    display(){
    
        console.log(this.color);
        console.log(this.design);
        console.log(this.material);
        console.log(this.size);
    }
    
 }
    var f2 = new Tshirt("red","dress","cotton","large");
    var f3 = new Tshirt("blue","pant","denim","small");
    var f4 = new Tshirt("pink","skirt","silk","medium");
    
    f3.display();
    console.log();
    f2.display();
    console.log();
    
    f4.display();
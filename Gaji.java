// polymorphism from subclass to superclass
public class Gaji extends Pegawai  {  
    private double salary;
    public Gaji(String name, String address, int number, double salary){
        super(name, address, number); // upcasting karena memakai perintah super untuk mengakses parent
        setSalary (salary);  
    }

    public void mailCheck(){  /*overriding karena memiliki nama yang sama dengan superclass, sehingga bereferensi
        ke subclass, maka disebut juga dengan downcasting*/
        System.out.println("Memeriksa kelas gaji dalam surat");
        System.out.println("Surat tertuju untuk" + getName() + "dengan gaji" +  salary);
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary =  newSalary;
        }
    }

    public double computePay(){
        System.out.println("Menghitung pembayaran gaji untuk" + getName()); return salary/52;
    }
    
}
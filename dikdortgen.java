import java.util.*;
public class DikdortgenCizimi {
//Dikdörtgen kenarlarının tanımlanması	
private int AKenari, BKenari;
public void Dikdortgen(int AKenari, int BKenari) {
this.AKenari = AKenari;
this.BKenari = BKenari;
}
//İçi Dolu Dikdörtgen Çizimi
public void IciDoluCizim() {
for( int j=0; j<AKenari; j++ ) {
for( int i=0; i<BKenari; i++) {
System.out.print("* "); //Kullanılacak karakter
}
System.out.println();
}
}
//İçi Boş Dikdörtgen Çizimi
public void IciBosCizim() {
for( int i=0; i<AKenari; i++ ) {
for( int j=0; j<BKenari; j++) {
if( i == 0 || i == AKenari-1 )
System.out.print("* "); //A kenarı kullanılacak karakter
else if( j == 0 || j == BKenari-1 )
System.out.print("* "); //B kenarı kullanılacak karakter
else
System.out.print(" ");  //Kenarlar arasındaki boşluk karakteri
}
System.out.println();
}
}
//Dikdörtgen kenar uzunluklarının kullanıcı tarafından girilmesi
public static void main( String args[] ) {
Scanner in = new Scanner( System.in );
System.out.print("A Kenar Uzunluğunu Giriniz: ");
int a = in.nextInt(); //A kenarı tanımlaması a
System.out.print("B Kenar Uzunluğunu Giriniz: ");
int b = in.nextInt(); //B kenarı tanımlaması b
Dikdortgen ciz = new Dikdortgen(a,b); //a ve tanımlamalarına göre dikdörtgen çizimi
//İçi boş dikdörtgen çizimi
ciz.IciBosCizim();
//İçi dolu dikdörtgen çizimi
ciz.IciDoluCizim();
in.close();
}
}

package `Kotlin Dasar`

fun main(){
    var age: Byte = 30;
    var height: Int = 170;
    var distance: Short = 2000;
    var balance: Long = 100000000L;

    var angkaFloat: Float = 10.10F;
    var angkaDouble: Double = 10.10;

    var binary: Int = 0b01010101;

//    fitur underscore agar lebih mudah di baca
    var price: Long = 9000_000_000;

//    conversion tipe data
    var number: Int = 100;
    var toByte: Byte = number.toByte();
    var toShort: Short = number.toShort();
    var toInt: Int = number.toInt();
    var toLong: Long = number.toLong();
    var toFloat: Float = number.toFloat();
    var toDouble: Double = number.toDouble();

    println(age);
    println(height);
    println(distance);
    println(balance);

    println(angkaDouble);
    println(angkaFloat);

    println(binary);

    println(price);

    print(toDouble);
}

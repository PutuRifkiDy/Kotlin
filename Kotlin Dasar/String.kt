package `Kotlin Dasar`

fun main() {
    var firstName: String = "Putu Rifki";
    var lastName: String = "Dirkayuda";

//    Menggabungkan String
    var fullName: String = firstName + " " + lastName;
//    Menggabungkan String dengan StringTemplate
    var fullNameDenganStringTemplate: String = "$firstName $lastName";
    var fullNameDenganHitungChar: String = "$firstName ${lastName.length}";

//   jika ingin lebih dari 1 baris

    var address: String = """
        Gunung Patas
        Gang Dampang Sari 2 No 4
        Gerbang Hitam
        """.trimIndent();

// Menghapus karakter lalu string tersebut dimentokin ke kiri
    var addressKita: String = """
        >Testing
        >Testing
        >Testing
    """.trimMargin(">");

    println(firstName);

    println(lastName);

    println(fullName);

    println(address);

    println(addressKita);

    println(fullNameDenganStringTemplate);

    println(fullNameDenganHitungChar);
}
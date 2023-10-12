package ArrayAndLoops

fun main(args: Array<String>) {
    var names = arrayOf("Maria", "Alex", "Bob")
    println(names[0])

    var num = 1;

    while (num <= 5) {
        println("Executou $num")
        num++;
    }

    for (index in 1..5) {
        println("Executou $index")
    }

    val posts = arrayOf("Viagem para praia", "Levei meu cachorro no veterinario", "Trilha com os amigos")

    for ((index, post) in posts.withIndex()) {
        println("$index: $post")
    }
}

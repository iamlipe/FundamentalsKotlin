package Constructor.entities

// Construtor primario
class User(
    var name: String = "",
    var lastname: String = ""
) {
    // Construtor secundario
    constructor(name: String) : this(name, "") {}

    init {
        println("nome: $name, sobrenome: $lastname")
    }
}

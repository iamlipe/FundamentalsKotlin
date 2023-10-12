package Interface.entities

class Journalist : People(), Candidate {

    override fun apply() {
        println("Candidato")
    }
}

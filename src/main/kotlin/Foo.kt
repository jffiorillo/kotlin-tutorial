data class FooRepository(private val dataSource: DataSource) {
    fun fetchById(id: String) = dataSource.getById(id)
}

interface DataSource {
    fun getById(id: String): FooModel
}

data class FooModel(
    val id: String,
    val age: Int
)


package com.miniichat.data

/**
 * Provider(s) pré-configurés, injectés automatiquement au tout premier
 * lancement de l'app (si aucun provider n'a jamais été enregistré dans le
 * DataStore). Une fois l'utilisateur a ajouté/modifié/supprimé un provider,
 * ce seed n'est plus rejoué.
 *
 * ⚠️ À COMPLÉTER AVANT COMPILATION avec votre URL et votre clé API.
 */
object DefaultProviders {
    val seed: List<ProviderConfig> = listOf(
        ProviderConfig(
            id = "default-custom",
            name = "Minix",              // <- nom affiché dans l'app
            baseUrl = "http://192.168.0.39:1234/v1", // <- URL complète (LM Studio, Ollama, etc.)
            apiKey = "",                        // <- clé API en dur (vide si non requis, ex. LM Studio local)
            models = emptyList()                // <- optionnel : ids de modèles pré-remplis, ex. listOf("local-model")
        )
    )
}

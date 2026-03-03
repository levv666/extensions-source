package eu.kanade.tachiyomi.extension.en.novelcrow

import eu.kanade.tachiyomi.multisrc.madara.Madara

class NovelCrow : Madara("NovelCrow", "https://novelcrow.com", "en") {

    override val useNewChapterEndpoint = true

    override val mangaSubString = ""

    override fun popularMangaRequest(page: Int) = GET(
    "$baseUrl/page/$page/?s=&post_type=wp-manga&m_orderby=views",
    headers,
)
}

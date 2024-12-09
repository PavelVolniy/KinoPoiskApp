package com.example.kinopoiskcinemaapp.presentation.home.filmpage

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import com.example.kinopoiskcinemaapp.domain.utils.FilmType
import com.example.kinopoiskcinemaapp.entity.collections.CollectionsType
import com.example.kinopoiskcinemaapp.entity.films.FilmItem
import javax.inject.Inject

class PagingFilmSource @Inject constructor(
    private val kinopoiskRepo: KinopoiskRepo,
    private val typeRequest: String
) : PagingSource<Int, FilmItem>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, FilmItem> {
        val startPosition = params.key ?: START_POSITION
        val resultList: List<FilmItem>
        try {

            resultList =
                if (CollectionsType.values().find { it.nameRequest == typeRequest } != null)
                    kinopoiskRepo.getCollections(type = typeRequest, page = startPosition).items
                else {
                    if (typeRequest == FilmType.PREMIERES.nameRequest) {
                        kinopoiskRepo.getPremieres().items
                    } else {
                        kinopoiskRepo.getFilmsByParams(
                            page = startPosition,
                            type = typeRequest
                        ).items
                    }
                }
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
        return LoadResult.Page(
            data = resultList,
            prevKey = null,
            nextKey = if (resultList.isEmpty()) null else startPosition + 1
        )
    }

    override fun getRefreshKey(state: PagingState<Int, FilmItem>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val person = state.closestItemToPosition(anchorPosition) ?: return null
        return ensureValidKey(person.filmId - (state.config.pageSize / 2))
    }
}

private fun ensureValidKey(key: Int) = START_POSITION.coerceAtLeast(key)

private const val START_POSITION = 1
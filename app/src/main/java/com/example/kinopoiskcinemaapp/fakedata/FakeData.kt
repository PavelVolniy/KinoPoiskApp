package com.example.kinopoiskcinemaapp.fakedata

import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.utils.FilmType
import com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails
import com.example.kinopoiskcinemaapp.entity.films.Country
import com.example.kinopoiskcinemaapp.entity.films.FilmItem
import com.example.kinopoiskcinemaapp.entity.films.Genre
import com.example.kinopoiskcinemaapp.entity.images.ItemFilmImages
import com.example.kinopoiskcinemaapp.entity.season.Episode
import com.example.kinopoiskcinemaapp.entity.season.SeasonFilm
import com.example.kinopoiskcinemaapp.entity.season.SeasonItem
import com.example.kinopoiskcinemaapp.entity.staff.Actor
import com.example.kinopoiskcinemaapp.entity.staff.Spouse
import com.example.kinopoiskcinemaapp.entity.staff.StaffItem

object FakeData {

    val seasons = SeasonFilm(
        total = 5,
        items = listOf(
            SeasonItem(
                number = 1,
                episodes = listOf(
                    Episode(
                        seasonNumber = 1,
                        episodeNumber = 1,
                        nameRu = "string",
                        nameEn = "Chapter One: The Vanishing of Will Byers",
                        synopsis = "The Vanishing of Will Byers...",
                        releaseDate = "2016-07-15"
                    ),
                    Episode(
                        seasonNumber = 1,
                        episodeNumber = 2,
                        nameRu = "string",
                        nameEn = "Chapter One: The Vanishing of Will Byers",
                        synopsis = "The Vanishing of Will Byers...",
                        releaseDate = "2016-07-15"
                    )
                )
            ),
            SeasonItem(
                number = 2,
                episodes = listOf(
                    Episode(
                        seasonNumber = 2,
                        episodeNumber = 1,
                        nameRu = "string",
                        nameEn = "Chapter One: The Vanishing of Will Byers",
                        synopsis = "The Vanishing of Will Byers...",
                        releaseDate = "2016-07-15"
                    ),
                    Episode(
                        seasonNumber = 2,
                        episodeNumber = 2,
                        nameRu = "string",
                        nameEn = "Chapter One: The Vanishing of Will Byers",
                        synopsis = "The Vanishing of Will Byers...",
                        releaseDate = "2016-07-15"
                    ),
                    Episode(
                        seasonNumber = 3,
                        episodeNumber = 3,
                        nameRu = "string",
                        nameEn = "Chapter One: The Vanishing of Will Byers",
                        synopsis = "The Vanishing of Will Byers...",
                        releaseDate = "2016-07-15"
                    )
                )
            )

        )
    )

    val startPairs = listOf(
        Pair(
            R.drawable.wfh_4_1,
            "stringArrayResource()"
        ),
        Pair(
            R.drawable.wfh_2,
            "stringArrayResource()"
        ),
        Pair(
            R.drawable.wfh_8,
            "stringArrayResource()"
        )
    )

    val filmImagesList = listOf(
        ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        ), ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        ), ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        ), ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        ), ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        ), ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        ), ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        ), ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        )
    )

    val filmDetails = FilmDetails(
        kinopoiskId = 301,
        kinopoiskHDId = "4824a95e60a7db7e86f14137516ba590",
        imdbId = "tt0133093",
        nameRu = "Матрица",
        nameEn = "The Matrix",
        nameOriginal = "The Matrix",
        posterUrl = "https://kinopoiskapiunofficial.tech/images/posters/kp/301.jpg",
        posterUrlPreview = "https://kinopoiskapiunofficial.tech/images/posters/kp_small/301.jpg",
        coverUrl = "https://avatars.mds.yandex.net/get-ott/1672343/2a0000016cc7177239d4025185c488b1bf43/orig",
        logoUrl = "https://avatars.mds.yandex.net/get-ott/1648503/2a00000170a5418408119bc802b53a03007b/orig",
        reviewsCount = 293,
        ratingGoodReview = 88.9,
        ratingGoodReviewVoteCount = 257,
        ratingKinopoisk = 8.5,
        ratingKinopoiskVoteCount = 524108,
        ratingImdb = 8.7,
        ratingImdbVoteCount = 1729087,
        ratingFilmCritics = 7.8,
        ratingFilmCriticsVoteCount = 155,
        ratingAwait = 7.8,
        ratingAwaitCount = 2,
        ratingRfCritics = 7.8,
        ratingRfCriticsVoteCount = 31,
        webUrl = "https://www.kinopoisk.ru/film/301/",
        year = 1999,
        filmLength = 136,
        slogan = "Добро пожаловать в реальный мир",
        description = "Жизнь Томаса Андерсона разделена на две части: Хакер Нео узнает, что его мир — виртуальный. Выдающийся экшен, доказавший, что зрелищное кино может быть умным Хакер Нео узнает, что его мир — виртуальный. Выдающийся экшен, доказавший, что зрелищное кино может быть умным Хакер Нео узнает, что его мир — виртуальный. Выдающийся экшен, доказавший, что зрелищное кино может быть умным Хакер Нео узнает, что его мир — виртуальный. Выдающийся экшен, доказавший, что зрелищное кино может быть умнымХакер Нео узнает, что его мир — виртуальный. Выдающийся экшен, доказавший, что зрелищное кино может быть умнымХакер Нео узнает, что его мир — виртуальный. Выдающийся экшен, доказавший, что зрелищное кино может быть умнымХакер Нео узнает, что его мир — виртуальный. Выдающийся экшен, доказавший, что зрелищное кино может быть умным",
        shortDescription = "Хакер Нео узнает, что его мир — виртуальный. Выдающийся экшен, доказавший, что зрелищное кино может быть умным",
        editorAnnotation = "Фильм доступен только на языке оригинала с русскими субтитрами",
        isTicketsAvailable = false,
        productionStatus = "POST_PRODUCTION",
        type = "FILM",
        ratingMpaa = "r",
        ratingAgeLimits = "age16",
        hasImax = false,
        has3D = false,
        lastSync = "2021-07-29T20:07:49.109817",
        countries = listOf(Country("США", 555)),
        genres = listOf(Genre("фантастика", 777)),
        startYear = 1996,
        endYear = 1996,
        serial = true,
        shortFilm = false,
        completed = false
    )

    val galleryItems = listOf(
        ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        ), ItemFilmImages(
            imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig",
            previewUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/300x"
        )
    )

    val filmItemList = listOf(
        FilmItem(
            countries = listOf(Country(country = "Россия", id = 0)),
            duration = 99,
            genres = listOf(
                Genre(genre = "фэнтези", 0),
                Genre(genre = "приключения", 0)
            ),
            kinopoiskId = 0,
            nameEn = "",
            nameRu = "Самая большая луна",
            posterUrl = "https://kinopoiskapiunofficial.tech/images/posters/kp/660906.jpg",
            posterUrlPreview = "https://kinopoiskapiunofficial.tech/images/posters/kp_small/660906.jpg",
            premiereRu = "2024-07-04",
            year = 2024,
            ratingImdb = 0.0,
            ratingImbd = 0.0,
            type = FilmType.FILM.toString(),
            ratingKinopoisk = 4.0,
            nameOriginal = "some text",
            imageUrl = "",
            imdbId = "",
            description = "some text",
            publishedAt = "",
            title = "some title",
            url = "some url",
            someData = "20.20.20",
            filmId = 0,
            general = true,
            professionKey = "ACTOR",
            rating = "7.2 or 76% if film has not released yet",
            relationType = "SIMILAR"
        ),
        FilmItem(
            countries = listOf(Country(country = "Россия", id = 0)),
            duration = 99,
            genres = listOf(
                Genre(genre = "фэнтези", 0),
                Genre(genre = "приключения", 0)
            ),
            kinopoiskId = 0,
            nameEn = "",
            nameRu = "Самая большая луна",
            posterUrl = "https://kinopoiskapiunofficial.tech/images/posters/kp/660906.jpg",
            posterUrlPreview = "https://kinopoiskapiunofficial.tech/images/posters/kp_small/660906.jpg",
            premiereRu = "2024-07-04",
            year = 2024,
            ratingImdb = 0.0,
            ratingImbd = 0.0,
            type = FilmType.FILM.toString(),
            ratingKinopoisk = 4.0,
            nameOriginal = "some text",
            imageUrl = "",
            imdbId = "",
            description = "some text",
            publishedAt = "",
            title = "some title",
            url = "some url",
            someData = "20.20.20",
            filmId = 0,
            general = true,
            professionKey = "ACTOR",
            rating = "7.2 or 76% if film has not released yet",
            relationType = "SIMILAR"
        ), FilmItem(
            countries = listOf(Country(country = "Россия", id = 0)),
            duration = 99,
            genres = listOf(
                Genre(genre = "фэнтези", 0),
                Genre(genre = "приключения", 0)
            ),
            kinopoiskId = 0,
            nameEn = "",
            nameRu = "Самая большая луна",
            posterUrl = "https://kinopoiskapiunofficial.tech/images/posters/kp/660906.jpg",
            posterUrlPreview = "https://kinopoiskapiunofficial.tech/images/posters/kp_small/660906.jpg",
            premiereRu = "2024-07-04",
            year = 2024,
            ratingImdb = 0.0,
            ratingImbd = 0.0,
            type = FilmType.FILM.toString(),
            ratingKinopoisk = 4.0,
            nameOriginal = "some text",
            imageUrl = "",
            imdbId = "",
            description = "some text",
            publishedAt = "",
            title = "some title",
            url = "some url",
            someData = "20.20.20",
            filmId = 0,
            general = true,
            professionKey = "ACTOR",
            rating = "7.2 or 76% if film has not released yet",
            relationType = "SIMILAR"
        ), FilmItem(
            countries = listOf(Country(country = "Россия", id = 0)),
            duration = 99,
            genres = listOf(
                Genre(genre = "фэнтези", 0),
                Genre(genre = "приключения", 0)
            ),
            kinopoiskId = 0,
            nameEn = "",
            nameRu = "Самая большая луна",
            posterUrl = "https://kinopoiskapiunofficial.tech/images/posters/kp/660906.jpg",
            posterUrlPreview = "https://kinopoiskapiunofficial.tech/images/posters/kp_small/660906.jpg",
            premiereRu = "2024-07-04",
            year = 2024,
            ratingImdb = 0.0,
            ratingImbd = 0.0,
            type = FilmType.FILM.toString(),
            ratingKinopoisk = 4.0,
            nameOriginal = "some text",
            imageUrl = "",
            imdbId = "",
            description = "some text",
            publishedAt = "",
            title = "some title",
            url = "some url",
            someData = "20.20.20",
            filmId = 0,
            general = true,
            professionKey = "ACTOR",
            rating = "7.2 or 76% if film has not released yet",
            relationType = "SIMILAR"
        )
    )


    val filmItem = FilmItem(
        countries = listOf(Country(country = "Россия", id = 0)),
        duration = 99,
        genres = listOf(
            Genre(genre = "фэнтези", 0),
            Genre(genre = "приключения", 0)
        ),
        kinopoiskId = 660906,
        nameEn = "",
        nameRu = "Самая большая луна",
        posterUrl = "https://kinopoiskapiunofficial.tech/images/posters/kp/660906.jpg",
        posterUrlPreview = "https://kinopoiskapiunofficial.tech/images/posters/kp_small/660906.jpg",
        premiereRu = "2024-07-04",
        year = 2024,
        ratingImdb = 0.0,
        ratingImbd = 0.0,
        type = FilmType.FILM.toString(),
        ratingKinopoisk = 4.0,
        nameOriginal = "some text",
        imageUrl = "",
        imdbId = "",
        description = "some text",
        publishedAt = "",
        title = "some title",
        url = "some url",
        someData = "20.20.20",
        filmId = 0,
        general = true,
        professionKey = "ACTOR",
        rating = "7.2 or 76% if film has not released yet",
        relationType = "SIMILAR"
    )


    val personStaff = arrayListOf(
        StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        ), StaffItem(
            staffId = 66539,
            nameRu = "Винс Гиллиган",
            nameEn = "Vince Gilligan",
            description = "Neo",
            posterUrl = "https://st.kp.yandex.net/images/actor/66539.jpg",
            professionText = "Режиссеры",
            professionKey = "DIRECTOR"
        )
    )

    val actor = Actor(
        personId = 66539,
        webUrl = "10096",
        nameRu = "Винс Гиллиган",
        nameEn = "Vince Gilligan",
        sex = "MALE",
        posterUrl = "https://kinopoiskapiunofficial.tech/images/actor_posters/kp/10096.jpg",
        growth = "174",
        birthday = "1965-04-04",
        death = "2008-01-22",
        age = 55,
        birthplace = "Манхэттэн, Нью-Йорк, США",
        deathplace = "Манхэттэн, Нью-Йорк, США",
        hasAwards = 1,
        profession = "Актер, Продюсер, Сценарист",
        facts = listOf("Полное имя - Роберт Джон Дауни младший (Robert John Downey Jr.)."),
        spouses = listOf(
            Spouse(
                personId = 32169,
                name = "Сьюзан Дауни",
                divorced = false,
                divorcedReason = "",
                sex = "MALE",
                children = 2,
                webUrl = "https://www.kinopoisk.ru/name/32169/",
                relation = "супруга"
            )
        ),
        films = listOf(
            FilmItem(
                countries = listOf(Country(country = "Россия", id = 0)),
                duration = 99,
                genres = listOf(
                    Genre(genre = "фэнтези", 0),
                    Genre(genre = "приключения", 0)
                ),
                kinopoiskId = 660906,
                nameEn = "",
                nameRu = "Самая большая луна",
                posterUrl = "https://kinopoiskapiunofficial.tech/images/posters/kp/660906.jpg",
                posterUrlPreview = "https://kinopoiskapiunofficial.tech/images/posters/kp_small/660906.jpg",
                premiereRu = "2024-07-04",
                year = 2024,
                ratingImdb = 0.0,
                ratingImbd = 0.0,
                type = FilmType.FILM.toString(),
                ratingKinopoisk = 4.0,
                nameOriginal = "some text",
                imageUrl = "",
                imdbId = "",
                description = "some text",
                publishedAt = "",
                title = "some title",
                url = "some url",
                someData = "20.20.20",
                filmId = 0,
                general = true,
                professionKey = "Monster",
                rating = "7.2 or 76% if film has not released yet",
                relationType = "SIMILAR"
            ), FilmItem(
                countries = listOf(Country(country = "Россия", id = 0)),
                duration = 99,
                genres = listOf(
                    Genre(genre = "фэнтези", 0),
                    Genre(genre = "приключения", 0)
                ),
                kinopoiskId = 660906,
                nameEn = "",
                nameRu = "Самая большая луна",
                posterUrl = "https://kinopoiskapiunofficial.tech/images/posters/kp/660906.jpg",
                posterUrlPreview = "https://kinopoiskapiunofficial.tech/images/posters/kp_small/660906.jpg",
                premiereRu = "2024-07-04",
                year = 2024,
                ratingImdb = 0.0,
                ratingImbd = 0.0,
                type = FilmType.FILM.toString(),
                ratingKinopoisk = 4.0,
                nameOriginal = "some text",
                imageUrl = "",
                imdbId = "",
                description = "some text",
                publishedAt = "",
                title = "some title",
                url = "some url",
                someData = "20.20.20",
                filmId = 0,
                general = true,
                professionKey = "ACTOR",
                rating = "7.2 or 76% if film has not released yet",
                relationType = "SIMILAR"
            ), FilmItem(
                countries = listOf(Country(country = "Россия", id = 0)),
                duration = 99,
                genres = listOf(
                    Genre(genre = "фэнтези", 0),
                    Genre(genre = "приключения", 0)
                ),
                kinopoiskId = 660906,
                nameEn = "",
                nameRu = "Самая большая луна",
                posterUrl = "https://kinopoiskapiunofficial.tech/images/posters/kp/660906.jpg",
                posterUrlPreview = "https://kinopoiskapiunofficial.tech/images/posters/kp_small/660906.jpg",
                premiereRu = "2024-07-04",
                year = 2024,
                ratingImdb = 0.0,
                ratingImbd = 0.0,
                type = FilmType.FILM.toString(),
                ratingKinopoisk = 4.0,
                nameOriginal = "some text",
                imageUrl = "",
                imdbId = "",
                description = "some text",
                publishedAt = "",
                title = "some title",
                url = "some url",
                someData = "20.20.20",
                filmId = 0,
                general = true,
                professionKey = "ACTOR",
                rating = "7.2 or 76% if film has not released yet",
                relationType = "SIMILAR"
            )
        )
    )

}
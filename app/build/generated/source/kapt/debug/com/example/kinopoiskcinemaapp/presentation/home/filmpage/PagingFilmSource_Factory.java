package com.example.kinopoiskcinemaapp.presentation.home.filmpage;

import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class PagingFilmSource_Factory implements Factory<PagingFilmSource> {
  private final Provider<KinopoiskRepo> kinopoiskRepoProvider;

  private final Provider<String> typeRequestProvider;

  public PagingFilmSource_Factory(Provider<KinopoiskRepo> kinopoiskRepoProvider,
      Provider<String> typeRequestProvider) {
    this.kinopoiskRepoProvider = kinopoiskRepoProvider;
    this.typeRequestProvider = typeRequestProvider;
  }

  @Override
  public PagingFilmSource get() {
    return newInstance(kinopoiskRepoProvider.get(), typeRequestProvider.get());
  }

  public static PagingFilmSource_Factory create(Provider<KinopoiskRepo> kinopoiskRepoProvider,
      Provider<String> typeRequestProvider) {
    return new PagingFilmSource_Factory(kinopoiskRepoProvider, typeRequestProvider);
  }

  public static PagingFilmSource newInstance(KinopoiskRepo kinopoiskRepo, String typeRequest) {
    return new PagingFilmSource(kinopoiskRepo, typeRequest);
  }
}

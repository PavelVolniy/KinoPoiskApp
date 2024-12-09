package com.example.kinopoiskcinemaapp.presentation.home.gallerypage;

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
public final class GalleryPageViewModel_Factory implements Factory<GalleryPageViewModel> {
  private final Provider<KinopoiskRepo> repoProvider;

  public GalleryPageViewModel_Factory(Provider<KinopoiskRepo> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public GalleryPageViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static GalleryPageViewModel_Factory create(Provider<KinopoiskRepo> repoProvider) {
    return new GalleryPageViewModel_Factory(repoProvider);
  }

  public static GalleryPageViewModel newInstance(KinopoiskRepo repo) {
    return new GalleryPageViewModel(repo);
  }
}

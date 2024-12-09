package com.example.kinopoiskcinemaapp.data.retrofit;

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
public final class KinopoiskRepo_Factory implements Factory<KinopoiskRepo> {
  private final Provider<KPApi> apiProvider;

  public KinopoiskRepo_Factory(Provider<KPApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public KinopoiskRepo get() {
    return newInstance(apiProvider.get());
  }

  public static KinopoiskRepo_Factory create(Provider<KPApi> apiProvider) {
    return new KinopoiskRepo_Factory(apiProvider);
  }

  public static KinopoiskRepo newInstance(KPApi api) {
    return new KinopoiskRepo(api);
  }
}

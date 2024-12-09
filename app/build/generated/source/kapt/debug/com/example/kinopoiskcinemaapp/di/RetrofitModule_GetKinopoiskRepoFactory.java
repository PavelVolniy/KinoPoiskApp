package com.example.kinopoiskcinemaapp.di;

import com.example.kinopoiskcinemaapp.data.retrofit.KPApi;
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RetrofitModule_GetKinopoiskRepoFactory implements Factory<KinopoiskRepo> {
  private final Provider<KPApi> apiProvider;

  public RetrofitModule_GetKinopoiskRepoFactory(Provider<KPApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public KinopoiskRepo get() {
    return getKinopoiskRepo(apiProvider.get());
  }

  public static RetrofitModule_GetKinopoiskRepoFactory create(Provider<KPApi> apiProvider) {
    return new RetrofitModule_GetKinopoiskRepoFactory(apiProvider);
  }

  public static KinopoiskRepo getKinopoiskRepo(KPApi api) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.getKinopoiskRepo(api));
  }
}

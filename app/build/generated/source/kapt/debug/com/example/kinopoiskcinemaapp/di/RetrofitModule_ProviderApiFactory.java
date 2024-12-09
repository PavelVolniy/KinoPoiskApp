package com.example.kinopoiskcinemaapp.di;

import android.content.Context;
import com.example.kinopoiskcinemaapp.data.retrofit.KPApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class RetrofitModule_ProviderApiFactory implements Factory<KPApi> {
  private final Provider<Context> contextProvider;

  public RetrofitModule_ProviderApiFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public KPApi get() {
    return providerApi(contextProvider.get());
  }

  public static RetrofitModule_ProviderApiFactory create(Provider<Context> contextProvider) {
    return new RetrofitModule_ProviderApiFactory(contextProvider);
  }

  public static KPApi providerApi(Context context) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.providerApi(context));
  }
}

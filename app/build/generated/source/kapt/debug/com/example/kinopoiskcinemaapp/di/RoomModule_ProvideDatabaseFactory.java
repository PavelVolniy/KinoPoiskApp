package com.example.kinopoiskcinemaapp.di;

import android.content.Context;
import com.example.kinopoiskcinemaapp.data.room.AppDataBase;
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
public final class RoomModule_ProvideDatabaseFactory implements Factory<AppDataBase> {
  private final Provider<Context> contextProvider;

  public RoomModule_ProvideDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDataBase get() {
    return provideDatabase(contextProvider.get());
  }

  public static RoomModule_ProvideDatabaseFactory create(Provider<Context> contextProvider) {
    return new RoomModule_ProvideDatabaseFactory(contextProvider);
  }

  public static AppDataBase provideDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.provideDatabase(context));
  }
}

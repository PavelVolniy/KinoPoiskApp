package com.example.kinopoiskcinemaapp.di;

import com.example.kinopoiskcinemaapp.data.room.AppDataBase;
import com.example.kinopoiskcinemaapp.data.room.FilmsDao;
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
public final class RoomModule_ProvideReportDaoFactory implements Factory<FilmsDao> {
  private final Provider<AppDataBase> dbProvider;

  public RoomModule_ProvideReportDaoFactory(Provider<AppDataBase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public FilmsDao get() {
    return provideReportDao(dbProvider.get());
  }

  public static RoomModule_ProvideReportDaoFactory create(Provider<AppDataBase> dbProvider) {
    return new RoomModule_ProvideReportDaoFactory(dbProvider);
  }

  public static FilmsDao provideReportDao(AppDataBase db) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.provideReportDao(db));
  }
}

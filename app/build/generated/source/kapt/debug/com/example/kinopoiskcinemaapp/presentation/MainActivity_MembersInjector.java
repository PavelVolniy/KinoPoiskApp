package com.example.kinopoiskcinemaapp.presentation;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<SharedPreferences> sharedPrefProvider;

  public MainActivity_MembersInjector(Provider<SharedPreferences> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<SharedPreferences> sharedPrefProvider) {
    return new MainActivity_MembersInjector(sharedPrefProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectSharedPref(instance, sharedPrefProvider.get());
  }

  @InjectedFieldSignature("com.example.kinopoiskcinemaapp.presentation.MainActivity.sharedPref")
  public static void injectSharedPref(MainActivity instance, SharedPreferences sharedPref) {
    instance.sharedPref = sharedPref;
  }
}

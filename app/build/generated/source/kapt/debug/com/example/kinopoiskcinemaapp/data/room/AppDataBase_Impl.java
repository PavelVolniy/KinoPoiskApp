package com.example.kinopoiskcinemaapp.data.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDataBase_Impl extends AppDataBase {
  private volatile FilmsDao _filmsDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `films` (`filmId` INTEGER, `filmName` TEXT NOT NULL, `image` TEXT NOT NULL, `genre` TEXT NOT NULL, `slogan` TEXT NOT NULL, `descriptions` TEXT NOT NULL, `countries` TEXT NOT NULL, `filmLength` TEXT NOT NULL, `ageLimit` TEXT NOT NULL, `rating` REAL NOT NULL, `date` INTEGER NOT NULL, PRIMARY KEY(`filmId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `collection_films` (`collectionName` TEXT NOT NULL, `icon` INTEGER NOT NULL, `closable` INTEGER NOT NULL, PRIMARY KEY(`collectionName`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `CollectionFilmCrossRef` (`collectionName` TEXT NOT NULL, `filmId` INTEGER NOT NULL, PRIMARY KEY(`collectionName`, `filmId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dba910b22e0485f5645bdb174edf568d')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `films`");
        db.execSQL("DROP TABLE IF EXISTS `collection_films`");
        db.execSQL("DROP TABLE IF EXISTS `CollectionFilmCrossRef`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsFilms = new HashMap<String, TableInfo.Column>(11);
        _columnsFilms.put("filmId", new TableInfo.Column("filmId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("filmName", new TableInfo.Column("filmName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("genre", new TableInfo.Column("genre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("slogan", new TableInfo.Column("slogan", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("descriptions", new TableInfo.Column("descriptions", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("countries", new TableInfo.Column("countries", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("filmLength", new TableInfo.Column("filmLength", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("ageLimit", new TableInfo.Column("ageLimit", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("rating", new TableInfo.Column("rating", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFilms = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFilms = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFilms = new TableInfo("films", _columnsFilms, _foreignKeysFilms, _indicesFilms);
        final TableInfo _existingFilms = TableInfo.read(db, "films");
        if (!_infoFilms.equals(_existingFilms)) {
          return new RoomOpenHelper.ValidationResult(false, "films(com.example.kinopoiskcinemaapp.domain.dto.FilmDTO).\n"
                  + " Expected:\n" + _infoFilms + "\n"
                  + " Found:\n" + _existingFilms);
        }
        final HashMap<String, TableInfo.Column> _columnsCollectionFilms = new HashMap<String, TableInfo.Column>(3);
        _columnsCollectionFilms.put("collectionName", new TableInfo.Column("collectionName", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCollectionFilms.put("icon", new TableInfo.Column("icon", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCollectionFilms.put("closable", new TableInfo.Column("closable", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCollectionFilms = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCollectionFilms = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCollectionFilms = new TableInfo("collection_films", _columnsCollectionFilms, _foreignKeysCollectionFilms, _indicesCollectionFilms);
        final TableInfo _existingCollectionFilms = TableInfo.read(db, "collection_films");
        if (!_infoCollectionFilms.equals(_existingCollectionFilms)) {
          return new RoomOpenHelper.ValidationResult(false, "collection_films(com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO).\n"
                  + " Expected:\n" + _infoCollectionFilms + "\n"
                  + " Found:\n" + _existingCollectionFilms);
        }
        final HashMap<String, TableInfo.Column> _columnsCollectionFilmCrossRef = new HashMap<String, TableInfo.Column>(2);
        _columnsCollectionFilmCrossRef.put("collectionName", new TableInfo.Column("collectionName", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCollectionFilmCrossRef.put("filmId", new TableInfo.Column("filmId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCollectionFilmCrossRef = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCollectionFilmCrossRef = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCollectionFilmCrossRef = new TableInfo("CollectionFilmCrossRef", _columnsCollectionFilmCrossRef, _foreignKeysCollectionFilmCrossRef, _indicesCollectionFilmCrossRef);
        final TableInfo _existingCollectionFilmCrossRef = TableInfo.read(db, "CollectionFilmCrossRef");
        if (!_infoCollectionFilmCrossRef.equals(_existingCollectionFilmCrossRef)) {
          return new RoomOpenHelper.ValidationResult(false, "CollectionFilmCrossRef(com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef).\n"
                  + " Expected:\n" + _infoCollectionFilmCrossRef + "\n"
                  + " Found:\n" + _existingCollectionFilmCrossRef);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "dba910b22e0485f5645bdb174edf568d", "29ffc8464dd99f68e94894280e227ec4");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "films","collection_films","CollectionFilmCrossRef");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `films`");
      _db.execSQL("DELETE FROM `collection_films`");
      _db.execSQL("DELETE FROM `CollectionFilmCrossRef`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(FilmsDao.class, FilmsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public FilmsDao filmsDao() {
    if (_filmsDao != null) {
      return _filmsDao;
    } else {
      synchronized(this) {
        if(_filmsDao == null) {
          _filmsDao = new FilmsDao_Impl(this);
        }
        return _filmsDao;
      }
    }
  }
}

package com.example.kinopoiskcinemaapp.data.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO;
import com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef;
import com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms;
import com.example.kinopoiskcinemaapp.domain.dto.FilmDTO;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FilmsDao_Impl implements FilmsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FilmDTO> __insertionAdapterOfFilmDTO;

  private final EntityInsertionAdapter<CollectionDTO> __insertionAdapterOfCollectionDTO;

  private final EntityInsertionAdapter<CollectionFilmCrossRef> __insertionAdapterOfCollectionFilmCrossRef;

  private final EntityDeletionOrUpdateAdapter<CollectionFilmCrossRef> __deletionAdapterOfCollectionFilmCrossRef;

  private final EntityDeletionOrUpdateAdapter<FilmDTO> __deletionAdapterOfFilmDTO;

  private final EntityDeletionOrUpdateAdapter<CollectionDTO> __deletionAdapterOfCollectionDTO;

  public FilmsDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFilmDTO = new EntityInsertionAdapter<FilmDTO>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `films` (`filmId`,`filmName`,`image`,`genre`,`slogan`,`descriptions`,`countries`,`filmLength`,`ageLimit`,`rating`,`date`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FilmDTO entity) {
        if (entity.getFilmId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getFilmId());
        }
        if (entity.getFilmName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getFilmName());
        }
        if (entity.getImage() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getImage());
        }
        if (entity.getGenre() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getGenre());
        }
        if (entity.getSlogan() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSlogan());
        }
        if (entity.getDescriptions() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getDescriptions());
        }
        if (entity.getCountries() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getCountries());
        }
        if (entity.getFilmLength() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getFilmLength());
        }
        if (entity.getAgeLimit() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getAgeLimit());
        }
        statement.bindDouble(10, entity.getRating());
        statement.bindLong(11, entity.getDate());
      }
    };
    this.__insertionAdapterOfCollectionDTO = new EntityInsertionAdapter<CollectionDTO>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR IGNORE INTO `collection_films` (`collectionName`,`icon`,`closable`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CollectionDTO entity) {
        if (entity.getCollectionName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getCollectionName());
        }
        statement.bindLong(2, entity.getIcon());
        final int _tmp = entity.getClosable() ? 1 : 0;
        statement.bindLong(3, _tmp);
      }
    };
    this.__insertionAdapterOfCollectionFilmCrossRef = new EntityInsertionAdapter<CollectionFilmCrossRef>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `CollectionFilmCrossRef` (`collectionName`,`filmId`) VALUES (?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CollectionFilmCrossRef entity) {
        if (entity.getCollectionName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getCollectionName());
        }
        statement.bindLong(2, entity.getFilmId());
      }
    };
    this.__deletionAdapterOfCollectionFilmCrossRef = new EntityDeletionOrUpdateAdapter<CollectionFilmCrossRef>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `CollectionFilmCrossRef` WHERE `collectionName` = ? AND `filmId` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CollectionFilmCrossRef entity) {
        if (entity.getCollectionName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getCollectionName());
        }
        statement.bindLong(2, entity.getFilmId());
      }
    };
    this.__deletionAdapterOfFilmDTO = new EntityDeletionOrUpdateAdapter<FilmDTO>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `films` WHERE `filmId` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FilmDTO entity) {
        if (entity.getFilmId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getFilmId());
        }
      }
    };
    this.__deletionAdapterOfCollectionDTO = new EntityDeletionOrUpdateAdapter<CollectionDTO>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `collection_films` WHERE `collectionName` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CollectionDTO entity) {
        if (entity.getCollectionName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getCollectionName());
        }
      }
    };
  }

  @Override
  public Object addFilm(final FilmDTO filmItem, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFilmDTO.insert(filmItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object addCollection(final CollectionDTO collectionDTO,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCollectionDTO.insert(collectionDTO);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object addCollectionWithFilmCrossRef(final CollectionFilmCrossRef collectionFilmCrossRef,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCollectionFilmCrossRef.insert(collectionFilmCrossRef);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteFilmFromCollection(final CollectionFilmCrossRef collectionFilmCrossRef,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCollectionFilmCrossRef.handle(collectionFilmCrossRef);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteReport(final FilmDTO filmDTO, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFilmDTO.handle(filmDTO);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteCollection(final CollectionDTO collectionDTO,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCollectionDTO.handle(collectionDTO);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getLast20Films(final Continuation<? super List<FilmDTO>> $completion) {
    final String _sql = "SELECT * FROM films ORDER BY date DESC LIMIT 20";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<FilmDTO>>() {
      @Override
      @NonNull
      public List<FilmDTO> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfFilmId = CursorUtil.getColumnIndexOrThrow(_cursor, "filmId");
            final int _cursorIndexOfFilmName = CursorUtil.getColumnIndexOrThrow(_cursor, "filmName");
            final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
            final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
            final int _cursorIndexOfSlogan = CursorUtil.getColumnIndexOrThrow(_cursor, "slogan");
            final int _cursorIndexOfDescriptions = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptions");
            final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
            final int _cursorIndexOfFilmLength = CursorUtil.getColumnIndexOrThrow(_cursor, "filmLength");
            final int _cursorIndexOfAgeLimit = CursorUtil.getColumnIndexOrThrow(_cursor, "ageLimit");
            final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
            final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
            final List<FilmDTO> _result = new ArrayList<FilmDTO>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final FilmDTO _item;
              final Integer _tmpFilmId;
              if (_cursor.isNull(_cursorIndexOfFilmId)) {
                _tmpFilmId = null;
              } else {
                _tmpFilmId = _cursor.getInt(_cursorIndexOfFilmId);
              }
              final String _tmpFilmName;
              if (_cursor.isNull(_cursorIndexOfFilmName)) {
                _tmpFilmName = null;
              } else {
                _tmpFilmName = _cursor.getString(_cursorIndexOfFilmName);
              }
              final String _tmpImage;
              if (_cursor.isNull(_cursorIndexOfImage)) {
                _tmpImage = null;
              } else {
                _tmpImage = _cursor.getString(_cursorIndexOfImage);
              }
              final String _tmpGenre;
              if (_cursor.isNull(_cursorIndexOfGenre)) {
                _tmpGenre = null;
              } else {
                _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
              }
              final String _tmpSlogan;
              if (_cursor.isNull(_cursorIndexOfSlogan)) {
                _tmpSlogan = null;
              } else {
                _tmpSlogan = _cursor.getString(_cursorIndexOfSlogan);
              }
              final String _tmpDescriptions;
              if (_cursor.isNull(_cursorIndexOfDescriptions)) {
                _tmpDescriptions = null;
              } else {
                _tmpDescriptions = _cursor.getString(_cursorIndexOfDescriptions);
              }
              final String _tmpCountries;
              if (_cursor.isNull(_cursorIndexOfCountries)) {
                _tmpCountries = null;
              } else {
                _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
              }
              final String _tmpFilmLength;
              if (_cursor.isNull(_cursorIndexOfFilmLength)) {
                _tmpFilmLength = null;
              } else {
                _tmpFilmLength = _cursor.getString(_cursorIndexOfFilmLength);
              }
              final String _tmpAgeLimit;
              if (_cursor.isNull(_cursorIndexOfAgeLimit)) {
                _tmpAgeLimit = null;
              } else {
                _tmpAgeLimit = _cursor.getString(_cursorIndexOfAgeLimit);
              }
              final double _tmpRating;
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
              final long _tmpDate;
              _tmpDate = _cursor.getLong(_cursorIndexOfDate);
              _item = new FilmDTO(_tmpFilmId,_tmpFilmName,_tmpImage,_tmpGenre,_tmpSlogan,_tmpDescriptions,_tmpCountries,_tmpFilmLength,_tmpAgeLimit,_tmpRating,_tmpDate);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllFilms(final Continuation<? super List<FilmDTO>> $completion) {
    final String _sql = "SELECT * FROM films ORDER BY date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<FilmDTO>>() {
      @Override
      @NonNull
      public List<FilmDTO> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfFilmId = CursorUtil.getColumnIndexOrThrow(_cursor, "filmId");
            final int _cursorIndexOfFilmName = CursorUtil.getColumnIndexOrThrow(_cursor, "filmName");
            final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
            final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
            final int _cursorIndexOfSlogan = CursorUtil.getColumnIndexOrThrow(_cursor, "slogan");
            final int _cursorIndexOfDescriptions = CursorUtil.getColumnIndexOrThrow(_cursor, "descriptions");
            final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
            final int _cursorIndexOfFilmLength = CursorUtil.getColumnIndexOrThrow(_cursor, "filmLength");
            final int _cursorIndexOfAgeLimit = CursorUtil.getColumnIndexOrThrow(_cursor, "ageLimit");
            final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
            final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
            final List<FilmDTO> _result = new ArrayList<FilmDTO>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final FilmDTO _item;
              final Integer _tmpFilmId;
              if (_cursor.isNull(_cursorIndexOfFilmId)) {
                _tmpFilmId = null;
              } else {
                _tmpFilmId = _cursor.getInt(_cursorIndexOfFilmId);
              }
              final String _tmpFilmName;
              if (_cursor.isNull(_cursorIndexOfFilmName)) {
                _tmpFilmName = null;
              } else {
                _tmpFilmName = _cursor.getString(_cursorIndexOfFilmName);
              }
              final String _tmpImage;
              if (_cursor.isNull(_cursorIndexOfImage)) {
                _tmpImage = null;
              } else {
                _tmpImage = _cursor.getString(_cursorIndexOfImage);
              }
              final String _tmpGenre;
              if (_cursor.isNull(_cursorIndexOfGenre)) {
                _tmpGenre = null;
              } else {
                _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
              }
              final String _tmpSlogan;
              if (_cursor.isNull(_cursorIndexOfSlogan)) {
                _tmpSlogan = null;
              } else {
                _tmpSlogan = _cursor.getString(_cursorIndexOfSlogan);
              }
              final String _tmpDescriptions;
              if (_cursor.isNull(_cursorIndexOfDescriptions)) {
                _tmpDescriptions = null;
              } else {
                _tmpDescriptions = _cursor.getString(_cursorIndexOfDescriptions);
              }
              final String _tmpCountries;
              if (_cursor.isNull(_cursorIndexOfCountries)) {
                _tmpCountries = null;
              } else {
                _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
              }
              final String _tmpFilmLength;
              if (_cursor.isNull(_cursorIndexOfFilmLength)) {
                _tmpFilmLength = null;
              } else {
                _tmpFilmLength = _cursor.getString(_cursorIndexOfFilmLength);
              }
              final String _tmpAgeLimit;
              if (_cursor.isNull(_cursorIndexOfAgeLimit)) {
                _tmpAgeLimit = null;
              } else {
                _tmpAgeLimit = _cursor.getString(_cursorIndexOfAgeLimit);
              }
              final double _tmpRating;
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
              final long _tmpDate;
              _tmpDate = _cursor.getLong(_cursorIndexOfDate);
              _item = new FilmDTO(_tmpFilmId,_tmpFilmName,_tmpImage,_tmpGenre,_tmpSlogan,_tmpDescriptions,_tmpCountries,_tmpFilmLength,_tmpAgeLimit,_tmpRating,_tmpDate);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getCollectionWithFilms(
      final Continuation<? super List<CollectionWithFilms>> $completion) {
    final String _sql = "SELECT * FROM collection_films";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<CollectionWithFilms>>() {
      @Override
      @NonNull
      public List<CollectionWithFilms> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfCollectionName = CursorUtil.getColumnIndexOrThrow(_cursor, "collectionName");
            final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
            final int _cursorIndexOfClosable = CursorUtil.getColumnIndexOrThrow(_cursor, "closable");
            final ArrayMap<String, ArrayList<FilmDTO>> _collectionFilms = new ArrayMap<String, ArrayList<FilmDTO>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey;
              if (_cursor.isNull(_cursorIndexOfCollectionName)) {
                _tmpKey = null;
              } else {
                _tmpKey = _cursor.getString(_cursorIndexOfCollectionName);
              }
              if (_tmpKey != null) {
                if (!_collectionFilms.containsKey(_tmpKey)) {
                  _collectionFilms.put(_tmpKey, new ArrayList<FilmDTO>());
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipfilmsAscomExampleKinopoiskcinemaappDomainDtoFilmDTO(_collectionFilms);
            final List<CollectionWithFilms> _result = new ArrayList<CollectionWithFilms>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final CollectionWithFilms _item;
              final CollectionDTO _tmpCollectionDTO;
              final String _tmpCollectionName;
              if (_cursor.isNull(_cursorIndexOfCollectionName)) {
                _tmpCollectionName = null;
              } else {
                _tmpCollectionName = _cursor.getString(_cursorIndexOfCollectionName);
              }
              final int _tmpIcon;
              _tmpIcon = _cursor.getInt(_cursorIndexOfIcon);
              final boolean _tmpClosable;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfClosable);
              _tmpClosable = _tmp != 0;
              _tmpCollectionDTO = new CollectionDTO(_tmpCollectionName,_tmpIcon,_tmpClosable);
              final ArrayList<FilmDTO> _tmpFilmsCollection;
              final String _tmpKey_1;
              if (_cursor.isNull(_cursorIndexOfCollectionName)) {
                _tmpKey_1 = null;
              } else {
                _tmpKey_1 = _cursor.getString(_cursorIndexOfCollectionName);
              }
              if (_tmpKey_1 != null) {
                _tmpFilmsCollection = _collectionFilms.get(_tmpKey_1);
              } else {
                _tmpFilmsCollection = new ArrayList<FilmDTO>();
              }
              _item = new CollectionWithFilms(_tmpCollectionDTO,_tmpFilmsCollection);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getCollectionWithFilmsByName(final String name,
      final Continuation<? super CollectionWithFilms> $completion) {
    final String _sql = "SELECT * FROM collection_films WHERE collectionName= ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<CollectionWithFilms>() {
      @Override
      @NonNull
      public CollectionWithFilms call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfCollectionName = CursorUtil.getColumnIndexOrThrow(_cursor, "collectionName");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfClosable = CursorUtil.getColumnIndexOrThrow(_cursor, "closable");
          final ArrayMap<String, ArrayList<FilmDTO>> _collectionFilms = new ArrayMap<String, ArrayList<FilmDTO>>();
          while (_cursor.moveToNext()) {
            final String _tmpKey;
            if (_cursor.isNull(_cursorIndexOfCollectionName)) {
              _tmpKey = null;
            } else {
              _tmpKey = _cursor.getString(_cursorIndexOfCollectionName);
            }
            if (_tmpKey != null) {
              if (!_collectionFilms.containsKey(_tmpKey)) {
                _collectionFilms.put(_tmpKey, new ArrayList<FilmDTO>());
              }
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipfilmsAscomExampleKinopoiskcinemaappDomainDtoFilmDTO(_collectionFilms);
          final CollectionWithFilms _result;
          if (_cursor.moveToFirst()) {
            final CollectionDTO _tmpCollectionDTO;
            final String _tmpCollectionName;
            if (_cursor.isNull(_cursorIndexOfCollectionName)) {
              _tmpCollectionName = null;
            } else {
              _tmpCollectionName = _cursor.getString(_cursorIndexOfCollectionName);
            }
            final int _tmpIcon;
            _tmpIcon = _cursor.getInt(_cursorIndexOfIcon);
            final boolean _tmpClosable;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfClosable);
            _tmpClosable = _tmp != 0;
            _tmpCollectionDTO = new CollectionDTO(_tmpCollectionName,_tmpIcon,_tmpClosable);
            final ArrayList<FilmDTO> _tmpFilmsCollection;
            final String _tmpKey_1;
            if (_cursor.isNull(_cursorIndexOfCollectionName)) {
              _tmpKey_1 = null;
            } else {
              _tmpKey_1 = _cursor.getString(_cursorIndexOfCollectionName);
            }
            if (_tmpKey_1 != null) {
              _tmpFilmsCollection = _collectionFilms.get(_tmpKey_1);
            } else {
              _tmpFilmsCollection = new ArrayList<FilmDTO>();
            }
            _result = new CollectionWithFilms(_tmpCollectionDTO,_tmpFilmsCollection);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getCountFilms(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT count(*) FROM films";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipfilmsAscomExampleKinopoiskcinemaappDomainDtoFilmDTO(
      @NonNull final ArrayMap<String, ArrayList<FilmDTO>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    if (_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      RelationUtil.recursiveFetchArrayMap(_map, true, (map) -> {
        __fetchRelationshipfilmsAscomExampleKinopoiskcinemaappDomainDtoFilmDTO(map);
        return Unit.INSTANCE;
      });
      return;
    }
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `films`.`filmId` AS `filmId`,`films`.`filmName` AS `filmName`,`films`.`image` AS `image`,`films`.`genre` AS `genre`,`films`.`slogan` AS `slogan`,`films`.`descriptions` AS `descriptions`,`films`.`countries` AS `countries`,`films`.`filmLength` AS `filmLength`,`films`.`ageLimit` AS `ageLimit`,`films`.`rating` AS `rating`,`films`.`date` AS `date`,_junction.`collectionName` FROM `CollectionFilmCrossRef` AS _junction INNER JOIN `films` ON (_junction.`filmId` = `films`.`filmId`) WHERE _junction.`collectionName` IN (");
    final int _inputSize = __mapKeySet == null ? 1 : __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    if (__mapKeySet == null) {
      _stmt.bindNull(_argIndex);
    } else {
      for (String _item : __mapKeySet) {
        if (_item == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, _item);
        }
        _argIndex++;
      }
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      // _junction.collectionName;
      final int _itemKeyIndex = 11;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfFilmId = 0;
      final int _cursorIndexOfFilmName = 1;
      final int _cursorIndexOfImage = 2;
      final int _cursorIndexOfGenre = 3;
      final int _cursorIndexOfSlogan = 4;
      final int _cursorIndexOfDescriptions = 5;
      final int _cursorIndexOfCountries = 6;
      final int _cursorIndexOfFilmLength = 7;
      final int _cursorIndexOfAgeLimit = 8;
      final int _cursorIndexOfRating = 9;
      final int _cursorIndexOfDate = 10;
      while (_cursor.moveToNext()) {
        final String _tmpKey;
        if (_cursor.isNull(_itemKeyIndex)) {
          _tmpKey = null;
        } else {
          _tmpKey = _cursor.getString(_itemKeyIndex);
        }
        if (_tmpKey != null) {
          final ArrayList<FilmDTO> _tmpRelation = _map.get(_tmpKey);
          if (_tmpRelation != null) {
            final FilmDTO _item_1;
            final Integer _tmpFilmId;
            if (_cursor.isNull(_cursorIndexOfFilmId)) {
              _tmpFilmId = null;
            } else {
              _tmpFilmId = _cursor.getInt(_cursorIndexOfFilmId);
            }
            final String _tmpFilmName;
            if (_cursor.isNull(_cursorIndexOfFilmName)) {
              _tmpFilmName = null;
            } else {
              _tmpFilmName = _cursor.getString(_cursorIndexOfFilmName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpGenre;
            if (_cursor.isNull(_cursorIndexOfGenre)) {
              _tmpGenre = null;
            } else {
              _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            }
            final String _tmpSlogan;
            if (_cursor.isNull(_cursorIndexOfSlogan)) {
              _tmpSlogan = null;
            } else {
              _tmpSlogan = _cursor.getString(_cursorIndexOfSlogan);
            }
            final String _tmpDescriptions;
            if (_cursor.isNull(_cursorIndexOfDescriptions)) {
              _tmpDescriptions = null;
            } else {
              _tmpDescriptions = _cursor.getString(_cursorIndexOfDescriptions);
            }
            final String _tmpCountries;
            if (_cursor.isNull(_cursorIndexOfCountries)) {
              _tmpCountries = null;
            } else {
              _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
            }
            final String _tmpFilmLength;
            if (_cursor.isNull(_cursorIndexOfFilmLength)) {
              _tmpFilmLength = null;
            } else {
              _tmpFilmLength = _cursor.getString(_cursorIndexOfFilmLength);
            }
            final String _tmpAgeLimit;
            if (_cursor.isNull(_cursorIndexOfAgeLimit)) {
              _tmpAgeLimit = null;
            } else {
              _tmpAgeLimit = _cursor.getString(_cursorIndexOfAgeLimit);
            }
            final double _tmpRating;
            _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            _item_1 = new FilmDTO(_tmpFilmId,_tmpFilmName,_tmpImage,_tmpGenre,_tmpSlogan,_tmpDescriptions,_tmpCountries,_tmpFilmLength,_tmpAgeLimit,_tmpRating,_tmpDate);
            _tmpRelation.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }
}

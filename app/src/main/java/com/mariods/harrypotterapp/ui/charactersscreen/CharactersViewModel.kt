package com.mariods.harrypotterapp.ui.charactersscreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mariods.harrypotterapp.domain.model.BooksList
import com.mariods.harrypotterapp.domain.model.CharactersList
import com.mariods.harrypotterapp.domain.usecases.GetAllCharacters
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(private val getAllCharacters: GetAllCharacters) : ViewModel() {

    private val _charactersList = MutableLiveData<List<CharactersList>>()
    val charactersList: LiveData<List<CharactersList>> = _charactersList

    fun onCreate() {
        getCharacters()
    }

    private fun getCharacters() {
        viewModelScope.launch {
            val response = getAllCharacters()
            _charactersList.postValue(response)
        }
    }

}


/*

{
    "data": [
    {
        "id": "8b7e8ccb-f2ef-42b0-a4cd-fb3c2572e619",
        "type": "character",
        "attributes": {
        "slug": "1992-gryffindor-vs-slytherin-quidditch-match-spectators",
        "alias_names": [],
        "animagus": null,
        "blood_status": null,
        "boggart": null,
        "born": null,
        "died": null,
        "eye_color": null,
        "family_members": [],
        "gender": null,
        "hair_color": null,
        "height": null,
        "house": null,
        "image": null,
        "jobs": [],
        "marital_status": null,
        "name": "1992 Gryffindor vs Slytherin Quidditch match spectators",
        "nationality": null,
        "patronus": null,
        "romances": [],
        "skin_color": null,
        "species": null,
        "titles": [],
        "wands": [],
        "weight": null,
        "wiki": "https://harrypotter.fandom.com/wiki/1992_Gryffindor_vs_Slytherin_Quidditch_match_spectators"
    },
        "links": {
        "self": "/v1/characters/8b7e8ccb-f2ef-42b0-a4cd-fb3c2572e619"
    }
    },
],
"meta": {
    "pagination": {
        "current": 1,
        "next": 2,
        "last": 50,
        "records": 4962
    },
    "copyright": "Copyright © Potter DB 2024",
    "generated_at": "2024-10-21T09:31:38.256Z"
},
"links": {
    "self": "https://api.potterdb.com/v1/characters",
    "current": "https://api.potterdb.com/v1/characters?page[number]=1",
    "next": "https://api.potterdb.com/v1/characters?page[number]=2",
    "last": "https://api.potterdb.com/v1/characters?page[number]=50"
}
}*/

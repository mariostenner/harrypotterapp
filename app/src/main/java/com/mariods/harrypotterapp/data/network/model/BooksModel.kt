package com.mariods.harrypotterapp.data.network.model

import com.google.gson.annotations.SerializedName


data class BooksModel(
    @SerializedName("data") val data: List<BooksList>
)

data class BooksList(
    @SerializedName("id") val id: String,
    @SerializedName("attributes") val booksAttributes: BooksAttributes
)

data class BooksAttributes(
    @SerializedName("title") val bkTitle: String,
    @SerializedName("author") val bkAuthor: String,
    @SerializedName("cover") val bkCover: String,
    @SerializedName("pages") val bkPages: Int,
    @SerializedName("release_date") val bkReleaseDate: String,
    @SerializedName("summary") val bkSummary: String
)

//Modificar a identificador con bkTitle y Attributes a BooksAttributes


/*
{
    "data": [
    {
        "id": "bb39c344-d3a4-4598-a3d2-dbdabfe9b068",
        "type": "book",
        "attributes": {
        "slug": "harry-potter-and-the-deathly-hallows",
        "author": "J. K. Rowling",
        "cover": "https://www.wizardingworld.com/images/products/books/UK/rectangle-7.jpg",
        "dedication": "To Neil, To Jessica, To David, To Kenzie, To Di, To Anne, And to You If you have stuck with Harry until the very end.",
        "pages": 610,
        "release_date": "2007-07-21",
        "summary": "As he climbs into the sidecar of Hagrid's motorbike and takes to the skies, leaving Privet Drive for the last time, Harry Potter knows that Lord Voldemort and the Death Eaters are not far behind. The protective charm that has kept Harry safe until now is broken, but he cannot keep hiding. The Dark Lord is breathing fear into everything Harry loves, and to stop him Harry will have to find and destroy the remaining Horcruxes. The final battle must begin – Harry must stand and face his enemy.",
        "title": "Harry Potter and the Deathly Hallows",
        "wiki": "https://harrypotter.fandom.com/wiki/Harry_Potter_and_the_Deathly_Hallows"
    },
        "relationships": {
        "chapters": {
        "data": [
        {
            "id": "9a3143a3-8418-42cc-9fbd-ca2bcf5bd54c",
            "type": "chapter"
        },
        {
            "id": "ef81589d-ff5b-4228-85d0-171248c96907",
            "type": "chapter"
        },
        {
            "id": "e007d9df-ef1e-46af-8b32-9aa0d199747e",
            "type": "chapter"
        },
        {
            "id": "52f99b9b-ab83-40af-816c-8bf5c621c5e4",
            "type": "chapter"
        },
        {
            "id": "da82a6aa-b22a-463f-983f-e8c297fd6577",
            "type": "chapter"
        },
        {
            "id": "beb360d0-64fe-416e-8b9e-f8dc7fb3ddd9",
            "type": "chapter"
        },
        {
            "id": "2a31fc64-ebe8-49ae-82e6-37f14d07d231",
            "type": "chapter"
        },
        {
            "id": "1af96a19-ca29-42b0-a8c9-c0b2ace5c133",
            "type": "chapter"
        },
        {
            "id": "874d4c20-e4bb-4784-9cd3-1690152f19c7",
            "type": "chapter"
        },
        {
            "id": "ac44dcec-c8dc-4f1b-820f-3a280d1e3943",
            "type": "chapter"
        },
        {
            "id": "be20d12e-dd0e-4685-bffa-e3e408dda965",
            "type": "chapter"
        },
        {
            "id": "fccb0323-012e-4b93-9e4c-6271845846b5",
            "type": "chapter"
        },
        {
            "id": "174c21b1-3a29-4a7a-836f-46b6c4f9bdb0",
            "type": "chapter"
        },
        {
            "id": "2b0739fd-ec3d-4756-bcb4-284a0668fe5b",
            "type": "chapter"
        },
        {
            "id": "895deeb5-183e-4599-97e4-d807cb523776",
            "type": "chapter"
        },
        {
            "id": "9530e998-9401-40bf-8e29-fa46bf3f9eb7",
            "type": "chapter"
        },
        {
            "id": "39ff38da-55cd-4411-8ca4-9b53d2fe72d9",
            "type": "chapter"
        },
        {
            "id": "8fe4efbd-de76-4565-97ec-a1b76d44f784",
            "type": "chapter"
        },
        {
            "id": "859fa2e1-340e-430e-be66-6ce90ec0d1bc",
            "type": "chapter"
        },
        {
            "id": "15e63403-a3ef-41d9-96a7-8bef66f7bb22",
            "type": "chapter"
        },
        {
            "id": "3fce21de-9b3a-4f10-b9c6-69996449924c",
            "type": "chapter"
        },
        {
            "id": "b340f611-90ab-4cff-97b6-5c765f144456",
            "type": "chapter"
        },
        {
            "id": "ffcb7821-6b56-4c00-97f3-e19750fa48c7",
            "type": "chapter"
        },
        {
            "id": "b717b4ea-d3a3-40b9-8b38-ef649c99cf46",
            "type": "chapter"
        },
        {
            "id": "eaaf4ebd-e124-4525-9fb7-c7ff53ed42d6",
            "type": "chapter"
        },
        {
            "id": "dc137b70-4574-433e-a0ce-a48a92745da5",
            "type": "chapter"
        },
        {
            "id": "e2621d98-88c5-470a-ba21-55f05c8fa047",
            "type": "chapter"
        },
        {
            "id": "7c16d17b-aebc-422a-9403-91122fc96481",
            "type": "chapter"
        },
        {
            "id": "741aaf50-fdba-44c6-9848-4a7bbed9cf88",
            "type": "chapter"
        },
        {
            "id": "b6980e91-85bc-464f-ac82-f220907d447a",
            "type": "chapter"
        },
        {
            "id": "efa585c1-56bb-4664-a008-aa6e6c32e73b",
            "type": "chapter"
        },
        {
            "id": "1ece7f19-eea2-48fd-885e-6acb8b2a6869",
            "type": "chapter"
        },
        {
            "id": "5d8316e4-4d91-401e-a472-153b16596c16",
            "type": "chapter"
        },
        {
            "id": "af255f82-66a6-4a8f-b84b-a2bc5ab687aa",
            "type": "chapter"
        },
        {
            "id": "f67a9591-bca2-460a-bece-cc30df16af7c",
            "type": "chapter"
        },
        {
            "id": "790cb02f-9bf5-4376-94a6-c7756c002193",
            "type": "chapter"
        },
        {
            "id": "24630b79-a51c-440d-89ee-ca358a41d966",
            "type": "chapter"
        }
        ]
    }
    },
        "links": {
        "self": "/v1/books/bb39c344-d3a4-4598-a3d2-dbdabfe9b068"
    }
    }
    ],
    "meta": {
    "pagination": {
    "current": 1,
    "records": 7
},
    "copyright": "Copyright © Potter DB 2024",
    "generated_at": "2024-10-21T09:31:37.107Z"
},
    "links": {
    "self": "https://api.potterdb.com/v1/books",
    "current": "https://api.potterdb.com/v1/books?page[number]=1"
}
}

*/


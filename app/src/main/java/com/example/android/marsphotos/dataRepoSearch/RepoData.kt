package com.example.android.marsphotos.dataRepoSearch

data class RepoData(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)
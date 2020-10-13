package com.example.form.Activity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Usuario(val nome: String, val email: String, val sexo: String, val disciplina: String, val telefone: String, val turma: String, val senha: String ): Parcelable



import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Film } from '../model/film';


const filmStoreUrl = 'http://localhost:8080';


@Injectable({
  providedIn: 'root'
})
export class FilmService {

  constructor(private http: HttpClient) { }

  searchForFilm(term: string): Observable<Film[]> {
    return this.http.get<Film[]>(`${filmStoreUrl}/search/${term}`);
  }
}

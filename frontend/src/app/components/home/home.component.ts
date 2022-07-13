import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Film } from 'src/app/model/film';
import { FilmService } from 'src/app/services/film.service';
import { FilmComponent } from '../film/film.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  filmForm!: FormGroup;
  films!: Film[];
  error!: string;

  constructor(private formBuilder: FormBuilder, private filmService: FilmService) { }

  ngOnInit(): void {
    this.filmForm = this.formBuilder.group({
      searchTerm: ['', Validators.required],
    })
  }

  onSubmit() {
    this.filmService.searchForFilm(this.filmForm.get('searchTerm')?.value)
      .subscribe({
        next: (data) => {
          console.log(data)
          this.films = data;
        },
        error: (error: string) => {
          this.error = error;
          console.log(error)
        }
      })
  }
}

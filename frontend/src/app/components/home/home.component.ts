import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FilmService } from 'src/app/services/film.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  filmForm!: FormGroup;
  response!: string;

  constructor(private formBuilder: FormBuilder, private filmService: FilmService) { }

  ngOnInit(): void {
    this.filmForm = this.formBuilder.group({
      filmId: ['', Validators.required],
    })
  }

  onSubmit() {
    this.filmService.getFilmById(this.filmForm.get('filmId')?.value)
      .subscribe({
        next: (data) => {
          this.response = data;
        },
        error: (error) => {
          this.response = error.error;
        }
      })
  }
}
